// Identity configuration for publishing plugin artifacts
group = "dev.all_things.plugins"
version = "0.1.0-SNAPSHOT"

fun String.prop() = providers.gradleProperty(this).get()
fun String.env() = providers.environmentVariable(this).get()

/**
 * Project level repositories for dependencies.
 *
 * Gradle uses its own repository by default.
 * Maven repository needs to be explicitly configured.
 */
repositories {

	// Google mirror of Maven Central for optimized performance
	google()

	// Maven Central (primary) artifact repository
	mavenCentral()
}

// Plugin configuration for the module
plugins {
	id("java") // Java support

	alias(libs.plugins.kotlin) // Kotlin support
	alias(libs.plugins.gradleIntelliJPlugin) // Gradle IntelliJ Plugin

	// See 'gradle/libs.versions.toml' for the list of available plugins
}

// Kotlin compiler configuration
kotlin {

	// JDK specific toolchain configuration
	jvmToolchain(17)
}

// IntelliJ platform configuration
intellij {
	// Minimum supported IntelliJ platform version
	version.set("2022.3")

	// Target IDE platform
	type.set("IU")
}