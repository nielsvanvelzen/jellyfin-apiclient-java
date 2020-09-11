// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import java.time.LocalDateTime
import java.util.UUID
import kotlin.Boolean
import kotlin.Long
import kotlin.String

data class AuthenticationInfo(
	/**
	 * Gets or sets the identifier.
	 */
	val id: Long,
	/**
	 * Gets or sets the access token.
	 */
	val accessToken: String? = null,
	/**
	 * Gets or sets the device identifier.
	 */
	val deviceId: String? = null,
	/**
	 * Gets or sets the name of the application.
	 */
	val appName: String? = null,
	/**
	 * Gets or sets the application version.
	 */
	val appVersion: String? = null,
	/**
	 * Gets or sets the name of the device.
	 */
	val deviceName: String? = null,
	/**
	 * Gets or sets the user identifier.
	 */
	val userId: UUID,
	/**
	 * Gets or sets a value indicating whether this instance is active.
	 */
	val isActive: Boolean,
	/**
	 * Gets or sets the date created.
	 */
	val dateCreated: LocalDateTime,
	/**
	 * Gets or sets the date revoked.
	 */
	val dateRevoked: LocalDateTime? = null,
	val dateLastActivity: LocalDateTime,
	val userName: String? = null
)