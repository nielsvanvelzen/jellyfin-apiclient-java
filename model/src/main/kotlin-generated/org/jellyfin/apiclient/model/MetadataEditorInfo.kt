// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.String
import kotlin.collections.List

data class MetadataEditorInfo(
	val parentalRatingOptions: List<ParentalRating>? = null,
	val countries: List<CountryInfo>? = null,
	val cultures: List<CultureDto>? = null,
	val externalIdInfos: List<ExternalIdInfo>? = null,
	val contentType: String? = null,
	val contentTypeOptions: List<NameValuePair>? = null
)