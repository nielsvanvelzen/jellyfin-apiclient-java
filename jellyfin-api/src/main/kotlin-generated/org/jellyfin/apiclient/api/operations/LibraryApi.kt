// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import io.ktor.utils.io.ByteReadChannel
import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.AllThemeMediaResult
import org.jellyfin.apiclient.model.api.BaseItemDto
import org.jellyfin.apiclient.model.api.BaseItemDtoQueryResult
import org.jellyfin.apiclient.model.api.ItemCounts
import org.jellyfin.apiclient.model.api.ItemFields
import org.jellyfin.apiclient.model.api.LibraryOptionsResultDto
import org.jellyfin.apiclient.model.api.MediaUpdateInfoDto
import org.jellyfin.apiclient.model.api.ThemeMediaResult

public class LibraryApi(
	private val api: KtorClient
) {
	/**
	 * Deletes items from the library and filesystem.
	 *
	 * @param ids The item ids.
	 */
	public suspend fun deleteItems(ids: List<UUID>? = emptyList()): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["ids"] = ids
		val data = null
		val response = api.delete<Unit>("/Items", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Deletes an item from the library and filesystem.
	 *
	 * @param itemId The item id.
	 */
	public suspend fun deleteItem(itemId: UUID): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Items/{itemId}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets similar items.
	 *
	 * @param itemId The item id.
	 * @param excludeArtistIds Exclude artist ids.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 */
	public suspend fun getSimilarAlbums(
		itemId: UUID,
		excludeArtistIds: List<UUID>? = emptyList(),
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Albums/{itemId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets similar items.
	 *
	 * @param itemId The item id.
	 * @param excludeArtistIds Exclude artist ids.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 */
	public suspend fun getSimilarArtists(
		itemId: UUID,
		excludeArtistIds: List<UUID>? = emptyList(),
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Artists/{itemId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets all parents of an item.
	 *
	 * @param itemId The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 */
	public suspend fun getAncestors(itemId: UUID, userId: UUID? = null): Response<List<BaseItemDto>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		val data = null
		val response = api.`get`<List<BaseItemDto>>("/Items/{itemId}/Ancestors", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets critic review for an item.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getCriticReviews(itemId: String): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Items/{itemId}/CriticReviews", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Downloads item media.
	 *
	 * @param itemId The item id.
	 */
	public suspend fun getDownload(itemId: UUID): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/Items/{itemId}/Download", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Downloads item media.
	 *
	 * @param itemId The item id.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getDownloadUrl(itemId: UUID, includeCredentials: Boolean = false): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/Items/{itemId}/Download", pathParameters, queryParameters,
				includeCredentials)
	}

	/**
	 * Get the original file of an item.
	 *
	 * @param itemId The item id.
	 */
	public suspend fun getFile(itemId: UUID): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/Items/{itemId}/File", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Get the original file of an item.
	 *
	 * @param itemId The item id.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getFileUrl(itemId: UUID, includeCredentials: Boolean = true): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/Items/{itemId}/File", pathParameters, queryParameters, includeCredentials)
	}

	/**
	 * Gets similar items.
	 *
	 * @param itemId The item id.
	 * @param excludeArtistIds Exclude artist ids.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 */
	public suspend fun getSimilarItems(
		itemId: UUID,
		excludeArtistIds: List<UUID>? = emptyList(),
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Items/{itemId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get theme songs and videos for an item.
	 *
	 * @param itemId The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param inheritFromParent Optional. Determines whether or not parent items should be searched for
	 * theme media.
	 */
	public suspend fun getThemeMedia(
		itemId: UUID,
		userId: UUID? = null,
		inheritFromParent: Boolean = false
	): Response<AllThemeMediaResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["inheritFromParent"] = inheritFromParent
		val data = null
		val response = api.`get`<AllThemeMediaResult>("/Items/{itemId}/ThemeMedia", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get theme songs for an item.
	 *
	 * @param itemId The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param inheritFromParent Optional. Determines whether or not parent items should be searched for
	 * theme media.
	 */
	public suspend fun getThemeSongs(
		itemId: UUID,
		userId: UUID? = null,
		inheritFromParent: Boolean = false
	): Response<ThemeMediaResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["inheritFromParent"] = inheritFromParent
		val data = null
		val response = api.`get`<ThemeMediaResult>("/Items/{itemId}/ThemeSongs", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get theme videos for an item.
	 *
	 * @param itemId The item id.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param inheritFromParent Optional. Determines whether or not parent items should be searched for
	 * theme media.
	 */
	public suspend fun getThemeVideos(
		itemId: UUID,
		userId: UUID? = null,
		inheritFromParent: Boolean = false
	): Response<ThemeMediaResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["inheritFromParent"] = inheritFromParent
		val data = null
		val response = api.`get`<ThemeMediaResult>("/Items/{itemId}/ThemeVideos", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get item counts.
	 *
	 * @param userId Optional. Get counts from a specific user's library.
	 * @param isFavorite Optional. Get counts of favorite items.
	 */
	public suspend fun getItemCounts(userId: UUID? = null, isFavorite: Boolean? = null):
			Response<ItemCounts> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["isFavorite"] = isFavorite
		val data = null
		val response = api.`get`<ItemCounts>("/Items/Counts", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the library options info.
	 *
	 * @param libraryContentType Library content type.
	 * @param isNewLibrary Whether this is a new library.
	 */
	public suspend fun getLibraryOptionsInfo(libraryContentType: String? = null, isNewLibrary: Boolean
			= false): Response<LibraryOptionsResultDto> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["libraryContentType"] = libraryContentType
		queryParameters["isNewLibrary"] = isNewLibrary
		val data = null
		val response = api.`get`<LibraryOptionsResultDto>("/Libraries/AvailableOptions", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Reports that new movies have been added by an external source.
	 */
	public suspend fun postUpdatedMedia(`data`: List<MediaUpdateInfoDto>): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Library/Media/Updated", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets all user media folders.
	 *
	 * @param isHidden Optional. Filter by folders that are marked hidden, or not.
	 */
	public suspend fun getMediaFolders(isHidden: Boolean? = null): Response<BaseItemDtoQueryResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["isHidden"] = isHidden
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Library/MediaFolders", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Reports that new movies have been added by an external source.
	 *
	 * @param tmdbId The tmdbId.
	 * @param imdbId The imdbId.
	 */
	public suspend fun postAddedMovies(tmdbId: String? = null, imdbId: String? = null):
			Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["tmdbId"] = tmdbId
		queryParameters["imdbId"] = imdbId
		val data = null
		val response = api.post<Unit>("/Library/Movies/Added", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Reports that new movies have been added by an external source.
	 *
	 * @param tmdbId The tmdbId.
	 * @param imdbId The imdbId.
	 */
	public suspend fun postUpdatedMovies(tmdbId: String? = null, imdbId: String? = null):
			Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["tmdbId"] = tmdbId
		queryParameters["imdbId"] = imdbId
		val data = null
		val response = api.post<Unit>("/Library/Movies/Updated", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a list of physical paths from virtual folders.
	 */
	public suspend fun getPhysicalPaths(): Response<List<String>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<String>>("/Library/PhysicalPaths", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Starts a library scan.
	 */
	public suspend fun refreshLibrary(): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<Unit>("/Library/Refresh", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Reports that new episodes of a series have been added by an external source.
	 *
	 * @param tvdbId The tvdbId.
	 */
	public suspend fun postAddedSeries(tvdbId: String? = null): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["tvdbId"] = tvdbId
		val data = null
		val response = api.post<Unit>("/Library/Series/Added", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Reports that new episodes of a series have been added by an external source.
	 *
	 * @param tvdbId The tvdbId.
	 */
	public suspend fun postUpdatedSeries(tvdbId: String? = null): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["tvdbId"] = tvdbId
		val data = null
		val response = api.post<Unit>("/Library/Series/Updated", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets similar items.
	 *
	 * @param itemId The item id.
	 * @param excludeArtistIds Exclude artist ids.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 */
	public suspend fun getSimilarMovies(
		itemId: UUID,
		excludeArtistIds: List<UUID>? = emptyList(),
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Movies/{itemId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets similar items.
	 *
	 * @param itemId The item id.
	 * @param excludeArtistIds Exclude artist ids.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 */
	public suspend fun getSimilarShows(
		itemId: UUID,
		excludeArtistIds: List<UUID>? = emptyList(),
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Shows/{itemId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets similar items.
	 *
	 * @param itemId The item id.
	 * @param excludeArtistIds Exclude artist ids.
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param limit Optional. The maximum number of records to return.
	 * @param fields Optional. Specify additional fields of information to return in the output. This
	 * allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines, TrailerUrls.
	 */
	public suspend fun getSimilarTrailers(
		itemId: UUID,
		excludeArtistIds: List<UUID>? = emptyList(),
		userId: UUID? = null,
		limit: Int? = null,
		fields: List<ItemFields>? = emptyList()
	): Response<BaseItemDtoQueryResult> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["excludeArtistIds"] = excludeArtistIds
		queryParameters["userId"] = userId
		queryParameters["limit"] = limit
		queryParameters["fields"] = fields
		val data = null
		val response = api.`get`<BaseItemDtoQueryResult>("/Trailers/{itemId}/Similar", pathParameters,
				queryParameters, data)
		return response
	}
}
