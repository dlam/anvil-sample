plugins {
    kotlin("jvm")
    id("com.squareup.anvil")
    id("application")
}


repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClassName = "MainKt"
}
