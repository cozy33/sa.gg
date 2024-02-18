rootProject.name = "supplybase"

include("supply-app")
include("supply-core")
include("supply-infra")

pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val detektVersion: String by settings
    val openapiGradleVersion: String by settings
    val graalvmBuildPluginVersion: String by settings

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.kapt" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyManagementVersion)
                "io.gitlab.arturbosch.detekt" -> useVersion(detektVersion)
                "org.springdoc.openapi-gradle-plugin" -> useVersion(openapiGradleVersion)
                "org.graalvm.buildtools.native" -> useVersion(graalvmBuildPluginVersion)
            }
        }
    }
}
