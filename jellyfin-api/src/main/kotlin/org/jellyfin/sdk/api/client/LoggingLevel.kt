package org.jellyfin.sdk.api.client

public enum class LoggingLevel {
	/**
	 * Log HTTP method and url for all HTTP requests.
	 */
	DEFAULT,

	/**
	 * Show HTTP headers for request and response.
	 *
	 * Note: Using this will show the access token in your logs. Use with caution!
	 */
	HEADERS,

	/**
	 * Show HTTP bodies for request and response.
	 *
	 * Note: Using this will show the access token in your logs. Use with caution!
	 */
	BODY,

	/**
	 * Combination of [HEADERS] and [BODY].
	 *
	 * Note: Using this will show access token in your logs. Use with caution!
	 */
	HEADERS_BODY,
}
