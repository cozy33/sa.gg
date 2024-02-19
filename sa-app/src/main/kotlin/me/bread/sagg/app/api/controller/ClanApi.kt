package me.bread.sagg.app.api.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ClanApi {

    @GetMapping("/clans/{test2}")
    fun getAllClan(
        @RequestParam test: String,
        @PathVariable test2: String,
    ): ResponseEntity<Result> {
        return ResponseEntity.ok(Result(result = "ok", data = Data("hi")))
    }
}

data class Result(
    val result: String,
    val data: Data,
    val error: String? = null,
)

data class Data(
    val result: String,
)
