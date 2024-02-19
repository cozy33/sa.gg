rootProject.name = "sa.gg"

include("sa-app")
include("sa-core")
include("sa-infra")
include("sa-tests:api-docs")

pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val detektVersion: String by settings
    val openapiGradleVersion: String by settings
    val graalvmBuildPluginVersion: String by settings
    val asciidoctorConvertVersion: String by settings

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
                "org.asciidoctor.jvm.convert" -> useVersion(asciidoctorConvertVersion)
            }
        }
    }
}
