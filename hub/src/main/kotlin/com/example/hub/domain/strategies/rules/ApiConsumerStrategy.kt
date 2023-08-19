package com.example.hub.domain.strategies.rules

import com.example.hub.domain.entities.enums.RuleType
import com.example.hub.domain.rules.ApiConsumerRule
import com.example.hub.domain.rules.Rule
import org.springframework.stereotype.Component

@Component
class ApiConsumerStrategy : RuleStrategy {

    val type = RuleType.API_CONSUMER
    override fun createRuleFromMap(ruleMap: Map<String, Any>): Rule<*> {
        return convertToApiConsumerRule(ruleMap)
    }

    private fun convertToApiConsumerRule(ruleMap: Map<String, Any>): Rule<*> {
        return ApiConsumerRule(1, "", "", listOf(), listOf(), "")
    }

}