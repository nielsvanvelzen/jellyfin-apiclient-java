// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Enum ItemFilter.
 */
@Serializable
enum class ItemFilter {
	@SerialName("IsFolder")
	IS_FOLDER,

	@SerialName("IsNotFolder")
	IS_NOT_FOLDER,

	@SerialName("IsUnplayed")
	IS_UNPLAYED,

	@SerialName("IsPlayed")
	IS_PLAYED,

	@SerialName("IsFavorite")
	IS_FAVORITE,

	@SerialName("IsResumable")
	IS_RESUMABLE,

	@SerialName("Likes")
	LIKES,

	@SerialName("Dislikes")
	DISLIKES,

	@SerialName("IsFavoriteOrLikes")
	IS_FAVORITE_OR_LIKES
}