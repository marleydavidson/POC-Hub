package com.example.hub.domain.rules

import com.google.gson.JsonObject

class DatabaseRule(
        override val order: Int,
        val rule: String,
        val databaseConnectionId: Int,
        val operation: String,
        val field: String,
        val table: String,
        val condition: String,
        val query: String,
        val resultOutput: Map<String, String>  // Mapeia campos do resultado para contexto. Por exemplo: "$ctx.result.seller_name" -> "name"
        , override var nextRule: Rule<*>?
) : Rule<JsonObject> {
    override fun execute(request: JsonObject): JsonObject {
        System.out.println("Executando a rule Database")
        nextRule?.execute(request)
        return request
    }
    override fun linkNextRule(rule: Rule<*>) {
        System.out.println(this.javaClass.name+ "nextRule ->"+rule.javaClass.name)
        this.nextRule = rule
    }
}