package com.example.hub.domain.rules

import com.example.hub.domain.entities.Header
import com.example.hub.domain.entities.Parameter
import com.google.gson.JsonObject
import lombok.Builder


@Builder
class ApiConsumerRule(
        override val order: Int,
        private val url: String,
        private val body: String,
        private val parameters: List<Parameter>,
        private val headers: List<Header>,
        private val contextOutput: String
) : Rule<JsonObject> {

    override fun execute(request: JsonObject): JsonObject {
        // Implemente sua lógica para consumir a API aqui.
        // Utilize os atributos `url`, `body`, `parameters`, `headers`, etc., conforme necessário.

        // Como exemplo, estou retornando diretamente a request, mas a ideia é que esta função faça as operações necessárias e retorne um resultado conforme necessário.
        return request;
    }
}