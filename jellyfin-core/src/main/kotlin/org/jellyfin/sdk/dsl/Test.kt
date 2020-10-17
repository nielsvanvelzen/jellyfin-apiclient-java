package org.jellyfin.apiclient.dsl

import org.jellyfin.apiclient.api.operations.SessionApi
import org.jellyfin.apiclient.model.api.*

suspend fun test(sessionApi: SessionApi) {
	// ugly
	sessionApi.postFullCapabilities(data = ClientCapabilities(
		playableMediaTypes = listOf(MediaType.AUDIO),
		supportedCommands = listOf(GeneralCommandType.BACK),
		deviceProfile =
	))

	// DSL
	sessionApi.postFullCapabilities(data = createCapabilities {
		// Support all media types
		+MediaType.values()
		// But not books
		-MediaType.BOOK

		// Support everything
		+GeneralCommandType.values()
		// Except BACK, nobody likes BACK
		-GeneralCommandType.BACK

		// Add it again, together with home
		+listOf(GeneralCommandType.BACK, GeneralCommandType.GO_HOME)

		supportsMediaControl = true

		// same context as createDeviceProfile
		deviceProfile("sample profile") {
			// Subtitles
			+"srt" to SubtitleDeliveryMethod.EXTERNAL
			+"ass" to SubtitleDeliveryMethod.ENCODE

			transcodingProfile {
				type = DlnaProfileType.VIDEO
				context = EncodingContext.STREAMING
				copyTimestamps = true
				container += "mkv"
				videoCodec += "H265"
				audioCodec += "AAC"
				audioCodec += "MP3"
			}

			codecProfile {
				type = CodecType.VIDEO
				codec = "H265"

				condition(ProfileConditionValue.VIDEO_PROFILE inList listOf("high", "main", "baseline", "constrained baseline"))
				condition(ProfileConditionValue.VIDEO_LEVEL lessEq if (DeviceUtils.isFireTvStick()) 41 else 51)
				condition(ProfileConditionValue.REF_FRAMES greaterEq 2)
			}
		}
	})
}
