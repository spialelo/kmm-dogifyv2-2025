plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.10" apply false
    id("com.squareup.sqldelight") version "1.5.3" apply false
//    alias(libs.plugins.kotlinSerialization) apply false
//    alias(org.jetbrains.kotlin.plugin.serialization) version '1.7.10'
}
