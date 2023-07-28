plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.20"
    `java-library`
    id("com.diffplug.spotless") version "6.20.0"
}

repositories {
    mavenCentral()
}

spotless {
    kotlin {
        ktlint()
    }
}
