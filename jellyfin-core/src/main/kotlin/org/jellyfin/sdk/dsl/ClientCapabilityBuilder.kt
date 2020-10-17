package org.jellyfin.apiclient.dsl

import org.jellyfin.apiclient.model.api.ClientCapabilities
import org.jellyfin.apiclient.model.api.DeviceProfile
import org.jellyfin.apiclient.model.api.GeneralCommandType

class ClientCapabilityBuilder {
	// TODO use ENUM
	val playableMediaTypes: MutableSet<String> = mutableSetOf()

	// TODO use ENUM
	val supportedCommands: MutableSet<String> = mutableSetOf()
	var supportsMediaControl: Boolean = false
	var supportsPersistentIdentifier: Boolean = false

	private var deviceProfile: DeviceProfile? = null

	// supported commands - add
	operator fun GeneralCommandType.unaryPlus() {
		supportedCommands.add(name)
	}

	operator fun Iterable<GeneralCommandType>.unaryPlus() {
		supportedCommands.addAll(map { it.name })
	}

	operator fun Array<GeneralCommandType>.unaryPlus() {
		supportedCommands.addAll(map { it.name })
	}

	// supported commands - remove
	operator fun GeneralCommandType.unaryMinus() {
		supportedCommands.remove(name)
	}

	operator fun Iterable<GeneralCommandType>.unaryMinus() {
		supportedCommands.removeAll(map { it.name })
	}

	operator fun Array<GeneralCommandType>.unaryMinus() {
		supportedCommands.removeAll(map { it.name })
	}

	// device profile
	fun deviceProfile(init: DeviceProfileBuilder.() -> Unit) {
		deviceProfile = DeviceProfileBuilder().apply(init).build()
	}

	fun deviceProfile(name: String, init: DeviceProfileBuilder.() -> Unit) {
		deviceProfile = DeviceProfileBuilder().also { builder ->
			builder.name = name
			builder.init()
		}.build()
	}

	fun build() = ClientCapabilities(
		playableMediaTypes = playableMediaTypes.toList(),
		supportedCommands = supportedCommands.toList(),
		supportsMediaControl = supportsMediaControl,
		supportsContentUploading = false,
		messageCallbackUrl = null,
		supportsPersistentIdentifier = supportsPersistentIdentifier,
		supportsSync = false,
		deviceProfile = deviceProfile,
		appStoreUrl = null,
		iconUrl = null
	)
}

fun createCapabilities(init: ClientCapabilityBuilder.() -> Unit) =
	ClientCapabilityBuilder().apply(init).build()

