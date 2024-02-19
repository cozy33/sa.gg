package me.bread.sagg.app.api.controller

import me.bread.sagg.app.api.support.response.ApiResponse
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
    ): ApiResponse<String> {
        return ApiResponse.success("test")
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
