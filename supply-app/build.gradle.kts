tasks.jar {
    enabled = false
}

tasks.bootJar {
    enabled = true
}

plugins {
    id("org.springdoc.openapi-gradle-plugin")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
    testImplementation("org.springframework.restdocs:spring-restdocs-restassured")
    testImplementation("io.rest-assured:spring-mock-mvc")
}

/*
    create openapi spec .yaml formatted file (for creating Redocly @see https://redocly.com/ api documents)
    to generate Redocly document you must use command in root project {$npx @redocly/cli build-docs api-docs.yaml}
    if you pass above process you can check documents on {current-env-host:port/docs.html}
 */
openApi {
    outputDir.set(file("docs"))
    outputFileName.set("api-docs.yaml")
}
