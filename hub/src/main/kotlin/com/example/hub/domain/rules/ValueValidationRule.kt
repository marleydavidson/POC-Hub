package com.example.hub.domain.rules

import com.google.gson.JsonObject

class ValueValidationRule(override val order: Int, override var nextRule: Rule<*>?)
    : Rule<JsonObject> {

    override fun execute(request: JsonObject): JsonObject {
        nextRule?.execute(request)
        return request;
    }

    override fun linkNextRule(rule: Rule<*>) {
       this.nextRule = rule
    }

}