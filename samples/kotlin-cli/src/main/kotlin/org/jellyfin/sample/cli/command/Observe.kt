package org.jellyfin.sample.cli.command

import com.github.ajalt.clikt.core.CliktCommand
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import org.jellyfin.sdk.Jellyfin
import org.jellyfin.sdk.api.sockets.WebSocketApi
import org.jellyfin.sdk.model.socket.ActivityLogEntryStartMessage
import org.jellyfin.sdk.model.socket.ScheduledTasksInfoStartMessage
import org.jellyfin.sdk.model.socket.SessionsStartMessage
import org.jellyfin.sample.cli.serverOption
import org.jellyfin.sample.cli.tokenOption

class Observe(
	private val jellyfin: Jellyfin
) : CliktCommand("Create a WebSocket connection and listen to all events") {
	private val server by serverOption()
	private val token by tokenOption()

	override fun run() = runBlocking {
		val api = jellyfin.createApi(baseUrl = server, accessToken = token)
		val webSocketApi = WebSocketApi(api)

		println("Starting subscription")

		// Send start messages to receive all events
		webSocketApi.publish(ActivityLogEntryStartMessage())
		webSocketApi.publish(SessionsStartMessage())
		webSocketApi.publish(ScheduledTasksInfoStartMessage())

		// Listen for messages
		webSocketApi.subscribe().collect { message ->
			println(message)
		}
	}
}
