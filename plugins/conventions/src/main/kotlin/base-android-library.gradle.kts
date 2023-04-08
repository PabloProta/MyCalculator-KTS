plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    compileSdk = Versions.COMPILE_SDK

    defaultConfig {
        minSdk = Versions.MIN_SDK
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

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
        sourceCompatibility = Versions.javaCompileVersion
        targetCompatibility = Versions.javaCompileVersion
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
}

/**
 * This can't be `private`. the dependencies scope will doesn't reach the libs variable in compile-
 * time.
 */
val libs: VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")


dependencies {
    testImplementation(libs.findLibrary("junit").get())
    androidTestImplementation(libs.findBundle("androidx.tests").get())
}

kapt {
    correctErrorTypes = true
}