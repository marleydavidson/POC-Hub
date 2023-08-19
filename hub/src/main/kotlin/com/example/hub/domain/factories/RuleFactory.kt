package com.example.hub.domain.factories

import com.example.hub.domain.rules.Rule
import com.example.hub.domain.strategies.rules.RuleStrategy
import org.springframework.beans.factory.annotation.Autowired

class RuleFactory(
) {
    @Autowired
    private lateinit var ruleStrategies: List<RuleStrategy>
    fun getRule(ruleMap: Map<String, Any>) : Rule<*>? {
        val type = ruleMap["rule"]
        return ruleStrategies.find { it.type == type }?.createRuleFromMap(ruleMap)
    }
}