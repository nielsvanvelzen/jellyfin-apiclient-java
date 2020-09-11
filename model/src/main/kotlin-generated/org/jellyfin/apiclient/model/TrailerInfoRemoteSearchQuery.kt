// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import java.util.UUID
import kotlin.Boolean
import kotlin.String

data class TrailerInfoRemoteSearchQuery(
	val searchInfo: TrailerInfo,
	val itemId: UUID,
	/**
	 * Will only search within the given provider when set.
	 */
	val searchProviderName: String? = null,
	/**
	 * Gets or sets a value indicating whether disabled providers should be included.
	 */
	val includeDisabledProviders: Boolean
)