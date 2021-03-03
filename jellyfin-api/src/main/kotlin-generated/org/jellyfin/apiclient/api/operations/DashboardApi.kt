// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.ConfigurationPageInfo
import org.jellyfin.apiclient.model.api.ConfigurationPageType

public class DashboardApi(
	private val api: KtorClient
) {
	/**
	 * Gets a dashboard configuration page.
	 *
	 * @param name The name of the page.
	 */
	public suspend fun getDashboardConfigurationPage(name: String? = null): Response<String> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		val data = null
		val response = api.`get`<String>("/web/ConfigurationPage", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets the configuration pages.
	 *
	 * @param enableInMainMenu Whether to enable in the main menu.
	 * @param pageType The Jellyfin.Api.Models.ConfigurationPageInfo.
	 */
	public suspend fun getConfigurationPages(enableInMainMenu: Boolean? = null,
			pageType: ConfigurationPageType? = null): Response<List<ConfigurationPageInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["enableInMainMenu"] = enableInMainMenu
		queryParameters["pageType"] = pageType
		val data = null
		val response = api.`get`<List<ConfigurationPageInfo>>("/web/ConfigurationPages", pathParameters,
				queryParameters, data)
		return response
	}
}
