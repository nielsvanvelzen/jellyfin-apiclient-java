// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.String

/**
 * Media Update Info Dto.
 */
data class MediaUpdateInfoDto(
	/**
	 * Gets or sets media path.
	 */
	val path: String? = null,
	/**
	 * Gets or sets media update type.
	 * Created, Modified, Deleted.
	 */
	val updateType: String? = null
)