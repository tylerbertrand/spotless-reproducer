plugins {
    id("com.gradle.enterprise") version("3.14.1")
    id("com.gradle.common-custom-user-data-gradle-plugin") version ("1.11.1")
}

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com"
    buildScan {
        publishAlways()
        isUploadInBackground = System.getenv("CI") == null
        capture {
            isTaskInputFiles = true
        }
    }
}

rootProject.name = "spotless-reproducer"
include(":lib")
