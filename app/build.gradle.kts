import java.io.IOException
import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.ossipeeriver.ravenawarenesskit"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ossipeeriver.ravenawarenesskit"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

        val apiKeysFile = project.rootProject.file("apikeys.properties")
        val properties = Properties()

        if (apiKeysFile.exists()) {
            try {
                properties.load(apiKeysFile.inputStream())

                properties.forEach { key, value ->
                    val keyStr = key as String
                    val valueStr = value as String

                    buildConfigField(
                        type = "String",
                        name = keyStr.uppercase(),
                        value = "\"$valueStr\""
                    )
                }
            } catch (e: NoSuchFileException) {
                throw GradleException("apikeys.properties file not found")
            } catch (e: IOException) {
                throw GradleException("failded to read apikeys.properties file")
            }
        } else {
            throw GradleException("API keys file not found: ${apiKeysFile.path}")
        }
    }

    buildTypes {
        release {
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
    buildFeatures {
        buildConfig = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.ui.text.google.fonts)
    implementation(libs.retrofit)
    implementation(libs.kotlinxSerializationJson)
    implementation(libs.retrofitSerializationConverter)
    implementation(libs.coilCompose)
    implementation(libs.firebaseCrashlyticsBuildTools)
    implementation(libs.androidx.room.common)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(libs.arcgis.maps.kotlin)
    implementation(platform(libs.arcgis.maps.kotlin.toolkit.bom))
    implementation(libs.arcgis.maps.kotlin.toolkit.geoview.compose)
    implementation(libs.arcgis.maps.kotlin.toolkit.authentication)
}