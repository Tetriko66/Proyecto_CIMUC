plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
<<<<<<< HEAD
    namespace = "com.example.appcimuc_grupox"
    compileSdk {
        version = release(36) {
=======
    namespace = "com.example.myapplication"
    compileSdk {
        version = release(37) {
>>>>>>> 90621b5 (feact: Terminando de iniciar el programa con la parte 1 de la guia 8)
            minorApiLevel = 1
        }
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "com.example.appcimuc_grupox"
        minSdk = 24
        targetSdk = 36
=======
        applicationId = "com.example.myapplication"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 37
        ;
>>>>>>> 90621b5 (feact: Terminando de iniciar el programa con la parte 1 de la guia 8)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
<<<<<<< HEAD
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
=======
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")// Trae todos los íconos
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material3.adaptive.navigation.suite)
>>>>>>> 90621b5 (feact: Terminando de iniciar el programa con la parte 1 de la guia 8)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
}