plugins {
    `kotlin-dsl`
}

dependencies {
    /**
     * Put the plugin here as dependencies, need
     * change the toml file to use the complete artifact
     * dependency name.
     */
    implementation(libs.android.library)
    implementation(libs.kotlin.android)
}