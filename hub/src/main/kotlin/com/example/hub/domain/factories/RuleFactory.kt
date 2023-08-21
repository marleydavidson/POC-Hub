package com.example.hub.domain.factories

import com.example.hub.domain.rules.Rule
import com.example.hub.domain.strategies.rules.RuleStrategy
import com.google.gson.Gson
import com.google.gson.JsonObject
import org.springframework.stereotype.Component

@Component
class RuleFactory(private val strategies: List<RuleStrategy>, private val gson: Gson) {

    fun createRule(json: JsonObject): Rule<*> {
        val ruleType = json.get("rule").asString
        val strategy = strategies.find { it.supports(ruleType) }
                ?: throw IllegalArgumentException("Unsupported rule type: $ruleType")

        return strategy.createRule(json)
    }
}