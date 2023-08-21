package com.example.hub.domain.strategies.rules

import com.example.hub.domain.entities.enums.RuleType
import com.example.hub.domain.rules.Rule
import com.example.hub.domain.rules.ValueValidationRule
import com.google.gson.Gson
import com.google.gson.JsonObject
import org.springframework.stereotype.Component

@Component
class ValueValidationStrategy (private val gson: Gson) : RuleStrategy {
    override fun supports(ruleType: String): Boolean = ruleType == RuleType.VALUE_VALIDATION.name
    override fun createRule(json: JsonObject): Rule<*> = gson.fromJson(json, ValueValidationRule::class.java)
}