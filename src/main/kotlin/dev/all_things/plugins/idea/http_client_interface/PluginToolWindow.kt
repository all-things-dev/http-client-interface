package dev.all_things.plugins.idea.http_client_interface

import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory

/**
 * This class is the starting point of the plugin functionality.
 *
 * Implementing {@link DumbAware} indicates that the tool window can be loaded
 * before indexing is complete.
 */
public class PluginToolWindow : ToolWindowFactory, DumbAware
{
	private val logger = thisLogger()

	/**
	 * Creates the tool window content.
	 */
	override fun createToolWindowContent(project: Project, window: ToolWindow)
	{

	}
}