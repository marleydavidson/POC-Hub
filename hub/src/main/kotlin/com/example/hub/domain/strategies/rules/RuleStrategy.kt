package com.example.hub.domain.strategies.rules

import com.example.hub.domain.rules.Rule
import com.google.gson.JsonObject


interface RuleStrategy {
    fun supports(ruleType: String): Boolean
    fun createRule(json: JsonObject): Rule<*>

}