plugins {
	id("kotlin-multiplatform")
	id("com.android.library")
}

kotlin {
	explicitApi()

	jvm()
	android()

	sourceSets {
		commonMain {
			dependencies {
				api(":jellyfin-api")
				api(":jellyfin-model")

				implementation(Dependencies.KotlinX.coroutinesCore)
				implementation(Dependencies.KotlinX.serializationJson)

				api(Dependencies.Ktor.http)

				// Logging
				implementation(Dependencies.Slf4j.api)
			}
		}

		commonTest {
			dependencies {
				implementation(Dependencies.Slf4j.simple)

				// Testing
				implementation(Dependencies.Kotlin.Test.junit)
			}
		}

		val androidMain by getting {
			dependencies {
				implementation(Dependencies.AndroidX.core)
				implementation(Dependencies.AndroidX.annotation)

				// TODO Fix this
				// coreLibraryDesugaring(Dependencies.Android.desugarJdkLibs)
			}
		}

		val androidTest by getting {
			dependencies {
				implementation(Dependencies.Kotlin.Test.junit)
			}
		}
	}
}


android {
	compileSdkVersion(30)
	sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

	defaultConfig {
		minSdkVersion(19)
		targetSdkVersion(30)
		multiDexEnabled = true

		consumerProguardFiles("proguard-rules.pro")
	}

	compileOptions {
		isCoreLibraryDesugaringEnabled = true

		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}

	sourceSets["main"].java.srcDirs("src/main/kotlin")
	sourceSets["test"].java.srcDirs("src/test/kotlin")

	buildTypes {
		getByName("release") {
			isMinifyEnabled = false
		}
	}

	lintOptions {
		isAbortOnError = false
	}
}
