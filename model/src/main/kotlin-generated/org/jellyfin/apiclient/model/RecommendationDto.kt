// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import java.util.UUID
import kotlin.String
import kotlin.collections.List

data class RecommendationDto(
	val items: List<BaseItemDto>? = null,
	val recommendationType: RecommendationType,
	val baselineItemName: String? = null,
	val categoryId: UUID
)