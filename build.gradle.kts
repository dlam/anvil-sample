buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4-M3")
        classpath("com.squareup.anvil:gradle-plugin:1.0.5-1.4-M3")
    }

    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        mavenCentral()
    }
}

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

subprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"

    plugins.withId("java") {
        tasks.withType(JavaCompile::class) {
            sourceCompatibility = "1.8"
            targetCompatibility = "1.8"
        }
    }

    plugins.withId("org.jetbrains.kotlin.jvm") {
        tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
            sourceCompatibility = "1.8"
            targetCompatibility = "1.8"

            kotlinOptions.jvmTarget = "1.8"
        }
    }

    repositories {
        google()
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
