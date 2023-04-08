plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.hilt)
    kotlin("kapt")
}

android {
    namespace = "com.example.mycalculator"

    defaultConfig {
        applicationId = "com.example.mycalculator"
        compileSdk = 33
        minSdk = 29
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileSdk = 33

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        resources.excludes.apply {
            add("META-INF/AL2.0")
            add("META-INF/LGPL2.1")
        }
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
    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose.ui.kit)
    implementation(libs.hilt)
    kapt(libs.hilt.compiler)

}
kapt {
    correctErrorTypes = true
}