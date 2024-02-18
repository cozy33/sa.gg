package me.bread.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

/**
 * 1. 모듈 나누기 core, infra, app
 * 2.
 */
