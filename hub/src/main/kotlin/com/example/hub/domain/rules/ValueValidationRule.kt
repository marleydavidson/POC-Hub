package com.example.hub.domain.rules

import com.google.gson.JsonObject

class ValueValidationRule(override val order: Int, override var nextRule: Rule<*>?)
    : Rule<JsonObject> {

    override fun execute(request: JsonObject): JsonObject {
        System.out.println("Executando a rule Value Validation")
        nextRule?.execute(request)
        return request;
    }

    override fun linkNextRule(rule: Rule<*>) {
       System.out.println(this.javaClass.name+ "nextRule ->"+rule.javaClass.name)
       this.nextRule = rule
    }

}