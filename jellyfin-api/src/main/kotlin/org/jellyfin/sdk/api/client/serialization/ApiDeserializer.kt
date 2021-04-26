package org.jellyfin.sdk.api.client.serialization

import io.ktor.util.*
import io.ktor.utils.io.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ExperimentalStdlibApi
public class ApiDeserializer {
	public companion object {
		public val TYPE_STRING: KType = typeOf<String>()
		public val TYPE_BINARY: KType = typeOf<ByteReadChannel>()
		public val TYPE_BOOLEAN: KType = typeOf<Boolean>()
		public val TYPE_UNIT: KType = typeOf<Unit>()
	}

	public val json: Json = Json {
		isLenient = false
		ignoreUnknownKeys = true
		allowSpecialFloatingPointValues = true
		useArrayPolymorphism = false
	}

	// Serialization

	public fun serialize(body: Any, type: KType): String? = when (type) {
		TYPE_STRING -> body as? String
		TYPE_BOOLEAN -> body.toString()
		TYPE_UNIT -> null
		else -> json.encodeToString(serializer(type), body)
	}

	public inline fun <reified T> serialize(body: Any): T =
		serialize(body, typeOf<T>()) as T

	// Deserialization

	public fun deserialize(body: ByteArray, type: KType): Any = when (type) {
		// Non-JSON types
		TYPE_STRING -> body.toString(Charsets.UTF_8)
		TYPE_BINARY -> ByteReadChannel(body)

		// JSON types
		else -> {
			val serializer = serializer(type)
			json.decodeFromString(serializer, body.toString(Charsets.UTF_8))!!
		}
	}

	public suspend fun deserialize(channel: ByteReadChannel, type: KType): Any = when (type) {
		// Return the channel when a channel is desired
		TYPE_BINARY -> channel
		// Otherwise read all bytes and use synchronous deserialize function
		else -> deserialize(channel.toByteArray(), type)
	}

	public inline fun <reified T> deserialize(body: ByteArray): T =
		deserialize(body, typeOf<T>()) as T

	public suspend inline fun <reified T> deserialize(channel: ByteReadChannel): T =
		deserialize(channel, typeOf<T>()) as T
}
