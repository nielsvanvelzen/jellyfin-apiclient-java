package org.jellyfin.sdk.api.client

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.network.sockets.*
import io.ktor.util.*
import io.ktor.utils.io.*
import kotlinx.serialization.SerializationException
import org.jellyfin.sdk.api.client.exception.InvalidContentException
import org.jellyfin.sdk.api.client.exception.InvalidStatusException
import org.jellyfin.sdk.api.client.exception.TimeoutException
import org.jellyfin.sdk.api.client.serialization.ApiDeserializer
import org.jellyfin.sdk.api.client.util.AuthorizationHeaderBuilder
import org.jellyfin.sdk.api.client.util.PathBuilder
import org.jellyfin.sdk.model.ClientInfo
import org.jellyfin.sdk.model.DeviceInfo
import org.slf4j.LoggerFactory
import java.net.UnknownHostException
import java.util.*
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@OptIn(ExperimentalStdlibApi::class)
public open class KtorClient(
	override var baseUrl: String? = null,
	override var accessToken: String? = null,
	override var userId: UUID? = null,
	override var clientInfo: ClientInfo,
	override var deviceInfo: DeviceInfo,
	override val httpClientOptions: HttpClientOptions,
) : ApiClient {
	public val apiDeserializer: ApiDeserializer = ApiDeserializer()

	/**
	 * Internal HTTP client. Should not be used directly. Use [request] instead.
	 * Exposed publicly to allow inline functions to work.
	 */
	public val client: HttpClient = HttpClient {
		followRedirects = httpClientOptions.followRedirects
		expectSuccess = false

		install(JsonFeature) {
			serializer = KotlinxSerializer(apiDeserializer.json)
		}

		install(HttpTimeout) {
			connectTimeoutMillis = httpClientOptions.connectTimeout
			requestTimeoutMillis = httpClientOptions.requestTimeout
			socketTimeoutMillis = httpClientOptions.socketTimeout
		}
	}

	override fun createUrl(
		pathTemplate: String,
		pathParameters: Map<String, Any?>,
		queryParameters: Map<String, Any?>,
		includeCredentials: Boolean,
	): String {
		// Check if the base url is not null
		val baseUrl = checkNotNull(baseUrl)

		return URLBuilder(baseUrl).apply {
			// Create from base URL
			takeFrom(baseUrl)

			// Replace path variables
			val path = PathBuilder.buildPath(pathTemplate, pathParameters)
			// Assign path making sure to remove duplicated slashes between the base and appended path
			encodedPath = "${encodedPath.trimEnd('/')}/${path.trimStart('/')}"

			// Append query parameters
			queryParameters
				.filterNot { it.value == null }
				.forEach { (key, rawValue) ->
					// Determine value
					val value = when (rawValue) {
						// Lists should be comma-separated
						is Collection<*> -> if (rawValue.isNotEmpty()) rawValue.joinToString(",") else null
						else -> rawValue.toString()
					}

					// Add not-null values
					if (value != null)
						parameters.append(key, value)
				}

			if (includeCredentials)
				parameters.append(ApiClient.QUERY_ACCESS_TOKEN, checkNotNull(accessToken))
		}.buildString()
	}

	@Suppress("ThrowsCount")
	public suspend fun <T> request(
		method: HttpMethod = HttpMethod.Get,
		pathTemplate: String,
		pathParameters: Map<String, Any?> = emptyMap(),
		queryParameters: Map<String, Any?> = emptyMap(),
		requestBody: Any? = null,
		responseType: KType = typeOf<Unit>(),
	): Response<T> {
		val logger = LoggerFactory.getLogger(this::class.java)
		val url = createUrl(pathTemplate, pathParameters, queryParameters)

		// Log HTTP call with access token removed
		val safeUrl = accessToken?.let { url.replace(it, "******") } ?: url
		logger.info("$method $safeUrl")

		@Suppress("SwallowedException", "TooGenericExceptionCaught")
		try {
			val request = client.request<HttpStatement> {
				this.method = method
				url(url)
				header(
					key = HttpHeaders.Authorization,
					value = AuthorizationHeaderBuilder.buildHeader(
						clientName = clientInfo.name,
						clientVersion = clientInfo.version,
						deviceId = deviceInfo.id,
						deviceName = deviceInfo.name,
						accessToken = accessToken
					)
				)

				if (requestBody != null) body = defaultSerializer().write(requestBody)
			}

			val response = request.execute()

			// Check HTTP status
			if (!response.status.isSuccess()) throw InvalidStatusException(response.status.value)
			// Read response body
			val channel = response.receive<ByteReadChannel>()
			return Response(
				content = apiDeserializer.deserialize(channel, responseType) as T,
				status = response.status.value,
				headers = response.headers.toMap()
			)
		} catch (err: UnknownHostException) {
			logger.debug("HTTP host unreachable", err)
			throw TimeoutException(err.message)
		} catch (err: HttpRequestTimeoutException) {
			logger.debug("HTTP request timed out", err)
			throw TimeoutException(err.message)
		} catch (err: ConnectTimeoutException) {
			logger.debug("Connection timed out", err)
			throw TimeoutException(err.message)
		} catch (err: SocketTimeoutException) {
			logger.debug("Socket timed out", err)
			throw TimeoutException(err.message)
		} catch (err: NoTransformationFoundException) {
			logger.error("Requested model does not exist!?", err)
			throw InvalidContentException(err.message)
		} catch (err: SerializationException) {
			logger.error("Deserialization failed", err)
			throw InvalidContentException(err.message)
		} catch (err: Throwable) {
			logger.error("Unknown error occurred!", err)
			throw err
		}
	}

	public suspend inline fun <reified T> get(
		pathTemplate: String,
		pathParameters: Map<String, Any?> = emptyMap(),
		queryParameters: Map<String, Any?> = emptyMap(),
		requestBody: Any? = null,
	): Response<T> = request(
		method = HttpMethod.Get,
		pathTemplate = pathTemplate,
		pathParameters = pathParameters,
		queryParameters = queryParameters,
		requestBody = requestBody,
		responseType = typeOf<T>(),
	)

	public suspend inline fun <reified T> post(
		pathTemplate: String,
		pathParameters: Map<String, Any?> = emptyMap(),
		queryParameters: Map<String, Any?> = emptyMap(),
		requestBody: Any? = null,
	): Response<T> = request(
		method = HttpMethod.Post,
		pathTemplate = pathTemplate,
		pathParameters = pathParameters,
		queryParameters = queryParameters,
		requestBody = requestBody,
		responseType = typeOf<T>(),
	)

	public suspend inline fun <reified T> delete(
		pathTemplate: String,
		pathParameters: Map<String, Any?> = emptyMap(),
		queryParameters: Map<String, Any?> = emptyMap(),
		requestBody: Any? = null,
	): Response<T> = request(
		method = HttpMethod.Delete,
		pathTemplate = pathTemplate,
		pathParameters = pathParameters,
		queryParameters = queryParameters,
		requestBody = requestBody,
		responseType = typeOf<T>(),
	)
}
