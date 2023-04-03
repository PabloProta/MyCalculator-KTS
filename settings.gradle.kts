pluginManagement {
    includeBuild("plugins")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

/**
 * this also can be
 * include (":app",":feature:home",":feature:calc",...)
 */
include(":app")
include(":feature:home")
include(":feature:calc")

/**
 * https://docs.gradle.org/7.0/release-notes.html
 *
 */
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
