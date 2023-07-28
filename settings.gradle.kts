plugins {
    id("com.gradle.enterprise") version ("3.14.1")
    id("com.gradle.common-custom-user-data-gradle-plugin") version ("1.11.1")
}

apply(from = "ge.gradle")

rootProject.name = "spotless-reproducer"
include(":lib")
