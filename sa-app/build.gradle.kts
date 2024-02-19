tasks.jar {
    enabled = false
}

tasks.bootJar {
    enabled = true
}

dependencies {
    testImplementation(project(":sa-tests:api-docs"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
