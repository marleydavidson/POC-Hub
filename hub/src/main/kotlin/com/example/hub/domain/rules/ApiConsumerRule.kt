package com.example.hub.domain.rules

import com.example.hub.domain.entities.Header
import com.example.hub.domain.entities.Parameter
import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import lombok.Builder
import org.slf4j.LoggerFactory


@Builder
class ApiConsumerRule(
        override val order: Int,
        val url: String,
        val rule: String,
        val body: String,
        val parameters: Parameter,
        val headers: List<Header>,
        @SerializedName("contextOutput")
        val contextOutput: String
) : Rule<JsonObject> {

    override var nextRule: Rule<*>? = null
    override fun execute(request: JsonObject): JsonObject {
        System.out.println("Executando a rule APi Consumer")
        nextRule?.execute(request)
        return request;
    }

    override fun linkNextRule(rule: Rule<*>) {
        System.out.println(this.javaClass.name+ "nextRule ->"+rule.javaClass.name)
        this.nextRule = rule
    }
}