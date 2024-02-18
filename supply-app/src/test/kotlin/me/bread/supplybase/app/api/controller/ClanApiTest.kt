package me.bread.supplybase.app.api.controller

import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import me.bread.supplybase.app.restdocs.RestDocsTest
import me.bread.supplybase.app.restdocs.RestDocsUtils.requestPreprocessor
import me.bread.supplybase.app.restdocs.RestDocsUtils.responsePreprocessor
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document
import org.springframework.restdocs.payload.JsonFieldType
import org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath
import org.springframework.restdocs.payload.PayloadDocumentation.responseFields
import org.springframework.restdocs.request.RequestDocumentation
import org.springframework.restdocs.request.RequestDocumentation.parameterWithName
import org.springframework.restdocs.request.RequestDocumentation.queryParameters

class ClanApiTest : RestDocsTest() {

    private lateinit var controller: ClanApi

    @BeforeEach
    fun setup() {
        controller = ClanApi()
        mockMvc = mockController(controller)
    }

    @Test
    fun `클랜 전체 목록 조회`() {
        given()
            .contentType(ContentType.JSON)
            .queryParam("test", "ok")
            .get("/clans/{test2}", "hi")
            .then()
            .status(HttpStatus.OK)
            .apply(
                document(
                    "get all clan",
                    requestPreprocessor(),
                    responsePreprocessor(),
                    RequestDocumentation.pathParameters(
                        parameterWithName("test2").description("ExampleValue"),
                    ),
                    queryParameters(
                        parameterWithName("test").description("ExampleParam"),
                    ),
                    responseFields(
                        fieldWithPath("result").type(JsonFieldType.STRING).description("ResultType"),
                        fieldWithPath("data.result").type(JsonFieldType.STRING).description("Result Date"),
                        fieldWithPath("error").type(JsonFieldType.NULL).ignored(),
                    ),
                ),
            )
    }
}
