package com.example.hub.domain.rules

import com.google.gson.JsonObject

class ValueValidationRule(override val order: Int)
    : Rule<String> {
    override fun execute(request: JsonObject): String {
        TODO("Not yet implemented")
    }

}