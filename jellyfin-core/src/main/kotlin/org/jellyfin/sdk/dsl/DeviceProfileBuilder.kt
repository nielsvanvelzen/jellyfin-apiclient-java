package org.jellyfin.apiclient.dsl

import org.jellyfin.apiclient.model.api.*

// https://github.com/jellyfin/jellyfin-androidtv/blob/master/app/src/main/java/org/jellyfin/androidtv/util/ProfileHelper.java
// https://github.com/jellyfin/jellyfin-roku/blob/master/source/utils/deviceCapabilities.brs

/**
 * Note: Does not contain ALL properties from DeviceProfile. Use .build().copy() to add those
 */
class DeviceProfileBuilder {
	var name: String = DEFAULT_NAME
	var maxStreamingBitrate: Long = DEFAULT_BITRATE
	var maxStaticBitrate: Long = DEFAULT_BITRATE

	var directPlayProfiles: MutableSet<DirectPlayProfile> = mutableSetOf()
	var transcodingProfiles: MutableSet<TranscodingProfile> = mutableSetOf()
//	var responseProfiles: MutableSet<ResponseProfile> = mutableSetOf()
	var codecProfiles: MutableSet<CodecProfile> = mutableSetOf()
	var containerProfiles: MutableSet<ContainerProfile> = mutableSetOf()
	var subtitleProfiles: MutableSet<SubtitleProfile> = mutableSetOf()

	fun build() = DeviceProfile(
		name = name,
		id = null,
		identification = null,
		friendlyName = name,
		manufacturer = null,
		manufacturerUrl = null,
		modelName = null,
		modelDescription = null,
		modelNumber = null,
		modelUrl = null,
		serialNumber = null,
		enableAlbumArtInDidl = true,
		enableSingleAlbumArtLimit = false,
		enableSingleSubtitleLimit = false,
		supportedMediaTypes = null,
		userId = null,
		albumArtPn = null,
		maxAlbumArtWidth = Int.MAX_VALUE,
		maxAlbumArtHeight = Int.MAX_VALUE,
		maxIconWidth = null,
		maxIconHeight = null,
		maxStreamingBitrate = maxStreamingBitrate,
		maxStaticBitrate = maxStaticBitrate,
		musicStreamingTranscodingBitrate = null,
		maxStaticMusicBitrate = null,
		sonyAggregationFlags = null,
		protocolInfo = null,
		timelineOffsetSeconds = 0,
		requiresPlainVideoItems = false,
		requiresPlainFolders = false,
		enableMsMediaReceiverRegistrar = false,
		ignoreTranscodeByteRangeRequests = false,
		xmlRootAttributes = null,
		directPlayProfiles = directPlayProfiles.toList(),
		transcodingProfiles = transcodingProfiles.toList(),
		containerProfiles = containerProfiles.toList(),
		codecProfiles = codecProfiles.toList(),
		responseProfiles = emptyList(),
		subtitleProfiles = subtitleProfiles.toList()
	)

	companion object {
		const val DEFAULT_NAME = "jellyfin-apiclient-java"
		const val DEFAULT_BITRATE = 8000000L // 1MB
	}
}

fun createDeviceProfile(init: DeviceProfileBuilder.() -> Unit) =
	DeviceProfileBuilder().apply(init).build()
