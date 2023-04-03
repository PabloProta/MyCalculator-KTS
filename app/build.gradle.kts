plugins {
    id("base-android-library")
}

android {
    namespace = "com.example.mycalculator"

    defaultConfig {
        compileSdk = 33
        minSdk = 29
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(projects.feature.home)
    implementation(projects.feature.calc)
    implementation(libs.bundles.compose.ui.kit)
}