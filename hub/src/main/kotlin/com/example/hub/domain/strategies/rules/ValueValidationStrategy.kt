package com.example.hub.domain.strategies.rules

import com.example.hub.domain.entities.enums.RuleType
import com.example.hub.domain.rules.Rule
import com.example.hub.domain.rules.ValueValidationRule
import org.springframework.stereotype.Component

@Component
class ValueValidationStrategy : RuleStrategy {

    val type = RuleType.VALUE_VALIDATION
    override fun createRuleFromMap(ruleMap: Map<String, Any>): Rule<*> {
        return convertToValueValidationRule(ruleMap)
    }

    private fun convertToValueValidationRule(ruleMap: Map<String, Any>): Rule<*> {
        return ValueValidationRule(1)
    }

}