// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.apiclient.model.api

import java.util.UUID
import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.apiclient.model.serializer.UUIDSerializer

/**
 * The configuration page info.
 */
@Serializable
public data class ConfigurationPageInfo(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets a value indicating whether the configurations page is enabled in the main menu.
	 */
	@SerialName("EnableInMainMenu")
	public val enableInMainMenu: Boolean,
	/**
	 * Gets or sets the menu section.
	 */
	@SerialName("MenuSection")
	public val menuSection: String? = null,
	/**
	 * Gets or sets the menu icon.
	 */
	@SerialName("MenuIcon")
	public val menuIcon: String? = null,
	/**
	 * Gets or sets the display name.
	 */
	@SerialName("DisplayName")
	public val displayName: String? = null,
	/**
	 * Gets or sets the type of the configuration page.
	 */
	@SerialName("ConfigurationPageType")
	public val configurationPageType: ConfigurationPageType,
	/**
	 * Gets or sets the plugin id.
	 */
	@SerialName("PluginId")
	public val pluginId: UUID? = null
)
