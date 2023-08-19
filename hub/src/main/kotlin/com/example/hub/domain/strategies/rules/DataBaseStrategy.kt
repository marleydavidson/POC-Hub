package com.example.hub.domain.strategies.rules

import com.example.hub.domain.entities.enums.RuleType
import com.example.hub.domain.rules.DatabaseRule
import com.example.hub.domain.rules.Rule
import org.hibernate.annotations.Comment
import org.springframework.stereotype.Component

@Component
class DataBaseStrategy : RuleStrategy {

    val type = RuleType.DATA_BASE
    override fun createRuleFromMap(ruleMap: Map<String, Any>): Rule<*> {
        return convertToDataBaseRule(ruleMap)
    }

    private fun convertToDataBaseRule(ruleMap: Map<String, Any>): Rule<*> {
        return DatabaseRule(1, 150, "", "", "", "", "", mapOf())
    }

}