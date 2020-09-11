// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import java.time.LocalDateTime
import java.util.UUID
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Get programs dto.
 */
data class GetProgramsDto(
	/**
	 * Gets or sets the channels to return guide information for.
	 */
	val channelIds: String? = null,
	/**
	 * Gets or sets optional. Filter by user id.
	 */
	val userId: UUID,
	/**
	 * Gets or sets the minimum premiere start date.
	 * Optional.
	 */
	val minStartDate: LocalDateTime? = null,
	/**
	 * Gets or sets filter by programs that have completed airing, or not.
	 * Optional.
	 */
	val hasAired: Boolean? = null,
	/**
	 * Gets or sets filter by programs that are currently airing, or not.
	 * Optional.
	 */
	val isAiring: Boolean? = null,
	/**
	 * Gets or sets the maximum premiere start date.
	 * Optional.
	 */
	val maxStartDate: LocalDateTime? = null,
	/**
	 * Gets or sets the minimum premiere end date.
	 * Optional.
	 */
	val minEndDate: LocalDateTime? = null,
	/**
	 * Gets or sets the maximum premiere end date.
	 * Optional.
	 */
	val maxEndDate: LocalDateTime? = null,
	/**
	 * Gets or sets filter for movies.
	 * Optional.
	 */
	val isMovie: Boolean? = null,
	/**
	 * Gets or sets filter for series.
	 * Optional.
	 */
	val isSeries: Boolean? = null,
	/**
	 * Gets or sets filter for news.
	 * Optional.
	 */
	val isNews: Boolean? = null,
	/**
	 * Gets or sets filter for kids.
	 * Optional.
	 */
	val isKids: Boolean? = null,
	/**
	 * Gets or sets filter for sports.
	 * Optional.
	 */
	val isSports: Boolean? = null,
	/**
	 * Gets or sets the record index to start at. All items with a lower index will be dropped from the
	 * results.
	 * Optional.
	 */
	val startIndex: Int? = null,
	/**
	 * Gets or sets the maximum number of records to return.
	 * Optional.
	 */
	val limit: Int? = null,
	/**
	 * Gets or sets specify one or more sort orders, comma delimited. Options: Name, StartDate.
	 * Optional.
	 */
	val sortBy: String? = null,
	/**
	 * Gets or sets sort Order - Ascending,Descending.
	 */
	val sortOrder: String? = null,
	/**
	 * Gets or sets the genres to return guide information for.
	 */
	val genres: String? = null,
	/**
	 * Gets or sets the genre ids to return guide information for.
	 */
	val genreIds: String? = null,
	/**
	 * Gets or sets include image information in output.
	 * Optional.
	 */
	val enableImages: Boolean? = null,
	/**
	 * Gets or sets a value indicating whether retrieve total record count.
	 */
	val enableTotalRecordCount: Boolean,
	/**
	 * Gets or sets the max number of images to return, per image type.
	 * Optional.
	 */
	val imageTypeLimit: Int? = null,
	/**
	 * Gets or sets the image types to include in the output.
	 * Optional.
	 */
	val enableImageTypes: String? = null,
	/**
	 * Gets or sets include user data.
	 * Optional.
	 */
	val enableUserData: Boolean? = null,
	/**
	 * Gets or sets filter by series timer id.
	 * Optional.
	 */
	val seriesTimerId: String? = null,
	/**
	 * Gets or sets filter by library series id.
	 * Optional.
	 */
	val librarySeriesId: UUID,
	/**
	 * Gets or sets specify additional fields of information to return in the output. This allows
	 * multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl,
	 * IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio,
	 * Revenue, SortName, Studios, Taglines.
	 * Optional.
	 */
	val fields: String? = null
)