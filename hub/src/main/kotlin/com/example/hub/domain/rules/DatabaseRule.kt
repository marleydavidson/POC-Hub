package com.example.hub.domain.rules

import com.google.gson.JsonObject

class DatabaseRule(
        override val order: Int,
        private val databaseConnectionId: Int,
        private val operation: String,
        private val field: String,
        private val table: String,
        private val condition: String,
        private val query: String,
        private val resultOutput: Map<String, String>  // Mapeia campos do resultado para contexto. Por exemplo: "$ctx.result.seller_name" -> "name"
) : Rule<JsonObject> {

    override fun execute(request: JsonObject): JsonObject {
        // Aqui, você implementaria sua lógica para consultar ou operar no banco de dados usando os atributos fornecidos.
        // Como exemplo, estou apenas retornando a request inalterada. Na prática, você retornaria o resultado da operação no banco de dados.

        return request
    }
}