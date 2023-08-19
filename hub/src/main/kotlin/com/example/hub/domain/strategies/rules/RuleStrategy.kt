package com.example.hub.domain.strategies.rules

import com.example.hub.domain.entities.enums.RuleType
import com.example.hub.domain.rules.Rule


interface RuleStrategy {
    val type: RuleType
    fun createRuleFromMap(ruleMap: Map<String, Any>): Rule<*>

}