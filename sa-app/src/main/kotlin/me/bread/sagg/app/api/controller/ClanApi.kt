package me.bread.sagg.app.api.controller

import me.bread.sagg.app.api.support.response.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ClanApi {

    @GetMapping("/clans/{level}")
    fun getClans(
        @PathVariable level: String,
    ): ApiResponse<String> {
        return ApiResponse.success("test")
    }
}

