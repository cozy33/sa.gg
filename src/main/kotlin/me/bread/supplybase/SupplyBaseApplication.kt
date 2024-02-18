package me.bread.supplybase

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SupplyBaseApplication

fun main(args: Array<String>) {
    runApplication<SupplyBaseApplication>(*args)
}

/**
 * 1. 모듈 나누기 core, infra, app
 * 2.
 */
