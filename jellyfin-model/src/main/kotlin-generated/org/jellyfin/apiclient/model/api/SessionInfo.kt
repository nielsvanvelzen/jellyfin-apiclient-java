// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	LocalDateTimeSerializer::class
)

package org.jellyfin.apiclient.model.api

import java.time.LocalDateTime
import java.util.UUID
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.LocalDateTimeSerializer
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * Class SessionInfo.
 */
@Serializable
public data class SessionInfo(
	@SerialName("PlayState")
	public val playState: PlayerStateInfo? = null,
	@SerialName("AdditionalUsers")
	public val additionalUsers: List<SessionUserInfo>? = null,
	@SerialName("Capabilities")
	public val capabilities: ClientCapabilities? = null,
	/**
	 * Gets or sets the remote end point.
	 */
	@SerialName("RemoteEndPoint")
	public val remoteEndPoint: String? = null,
	/**
	 * Gets or sets the playable media types.
	 */
	@SerialName("PlayableMediaTypes")
	public val playableMediaTypes: List<String>? = null,
	/**
	 * Gets or sets the id.
	 */
	@SerialName("Id")
	public val id: String? = null,
	/**
	 * Gets or sets the user id.
	 */
	@SerialName("UserId")
	public val userId: UUID,
	/**
	 * Gets or sets the username.
	 */
	@SerialName("UserName")
	public val userName: String? = null,
	/**
	 * Gets or sets the type of the client.
	 */
	@SerialName("Client")
	public val client: String? = null,
	/**
	 * Gets or sets the last activity date.
	 */
	@SerialName("LastActivityDate")
	public val lastActivityDate: LocalDateTime,
	/**
	 * Gets or sets the last playback check in.
	 */
	@SerialName("LastPlaybackCheckIn")
	public val lastPlaybackCheckIn: LocalDateTime,
	/**
	 * Gets or sets the name of the device.
	 */
	@SerialName("DeviceName")
	public val deviceName: String? = null,
	/**
	 * Gets or sets the type of the device.
	 */
	@SerialName("DeviceType")
	public val deviceType: String? = null,
	/**
	 * This is strictly used as a data transfer object from the api layer.
	 * This holds information about a BaseItem in a format that is convenient for the client.
	 */
	@SerialName("NowPlayingItem")
	public val nowPlayingItem: BaseItemDto? = null,
	/**
	 * Class BaseItem.
	 */
	@SerialName("FullNowPlayingItem")
	public val fullNowPlayingItem: BaseItem? = null,
	/**
	 * This is strictly used as a data transfer object from the api layer.
	 * This holds information about a BaseItem in a format that is convenient for the client.
	 */
	@SerialName("NowViewingItem")
	public val nowViewingItem: BaseItemDto? = null,
	/**
	 * Gets or sets the device id.
	 */
	@SerialName("DeviceId")
	public val deviceId: String? = null,
	/**
	 * Gets or sets the application version.
	 */
	@SerialName("ApplicationVersion")
	public val applicationVersion: String? = null,
	@SerialName("TranscodingInfo")
	public val transcodingInfo: TranscodingInfo? = null,
	/**
	 * Gets a value indicating whether this instance is active.
	 */
	@SerialName("IsActive")
	public val isActive: Boolean,
	@SerialName("SupportsMediaControl")
	public val supportsMediaControl: Boolean,
	@SerialName("SupportsRemoteControl")
	public val supportsRemoteControl: Boolean,
	@SerialName("NowPlayingQueue")
	public val nowPlayingQueue: List<QueueItem>? = null,
	@SerialName("HasCustomDeviceName")
	public val hasCustomDeviceName: Boolean,
	@SerialName("PlaylistItemId")
	public val playlistItemId: String? = null,
	@SerialName("ServerId")
	public val serverId: String? = null,
	@SerialName("UserPrimaryImageTag")
	public val userPrimaryImageTag: String? = null,
	/**
	 * Gets or sets the supported commands.
	 */
	@SerialName("SupportedCommands")
	public val supportedCommands: List<GeneralCommandType>? = null
)
