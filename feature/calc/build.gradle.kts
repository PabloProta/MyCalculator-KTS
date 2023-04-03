plugins {
    id("base-android-library")
}
android {
    namespace = "com.example.mycalculator.cal"
}

dependencies {
    implementation(projects.feature.home)
}