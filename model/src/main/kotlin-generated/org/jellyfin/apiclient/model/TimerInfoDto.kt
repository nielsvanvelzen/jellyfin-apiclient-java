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
import kotlin.Long
import kotlin.String
import kotlin.collections.List

data class TimerInfoDto(
	val status: RecordingStatus,
	/**
	 * Gets or sets the series timer identifier.
	 */
	val seriesTimerId: String? = null,
	/**
	 * Gets or sets the external series timer identifier.
	 */
	val externalSeriesTimerId: String? = null,
	/**
	 * Gets or sets the run time ticks.
	 */
	val runTimeTicks: Long? = null,
	val programInfo: BaseItemDto,
	/**
	 * Id of the recording.
	 */
	val id: String? = null,
	val type: String? = null,
	/**
	 * Gets or sets the server identifier.
	 */
	val serverId: String? = null,
	/**
	 * Gets or sets the external identifier.
	 */
	val externalId: String? = null,
	/**
	 * ChannelId of the recording.
	 */
	val channelId: UUID,
	/**
	 * Gets or sets the external channel identifier.
	 */
	val externalChannelId: String? = null,
	/**
	 * ChannelName of the recording.
	 */
	val channelName: String? = null,
	val channelPrimaryImageTag: String? = null,
	/**
	 * Gets or sets the program identifier.
	 */
	val programId: String? = null,
	/**
	 * Gets or sets the external program identifier.
	 */
	val externalProgramId: String? = null,
	/**
	 * Name of the recording.
	 */
	val name: String? = null,
	/**
	 * Description of the recording.
	 */
	val overview: String? = null,
	/**
	 * The start date of the recording, in UTC.
	 */
	val startDate: LocalDateTime,
	/**
	 * The end date of the recording, in UTC.
	 */
	val endDate: LocalDateTime,
	/**
	 * Gets or sets the name of the service.
	 */
	val serviceName: String? = null,
	/**
	 * Gets or sets the priority.
	 */
	val priority: Int,
	/**
	 * Gets or sets the pre padding seconds.
	 */
	val prePaddingSeconds: Int,
	/**
	 * Gets or sets the post padding seconds.
	 */
	val postPaddingSeconds: Int,
	/**
	 * Gets or sets a value indicating whether this instance is pre padding required.
	 */
	val isPrePaddingRequired: Boolean,
	/**
	 * If the item does not have any backdrops, this will hold the Id of the Parent that has one.
	 */
	val parentBackdropItemId: String? = null,
	/**
	 * Gets or sets the parent backdrop image tags.
	 */
	val parentBackdropImageTags: List<String>? = null,
	/**
	 * Gets or sets a value indicating whether this instance is post padding required.
	 */
	val isPostPaddingRequired: Boolean,
	val keepUntil: KeepUntil
)