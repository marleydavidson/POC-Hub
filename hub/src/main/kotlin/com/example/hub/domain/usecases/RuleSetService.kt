package com.example.hub.domain.usecases

import com.example.hub.domain.factories.RuleFactory
import com.example.hub.domain.rules.RuleSet
import com.google.gson.JsonParser
import org.springframework.stereotype.Service

@Service
class RuleSetService(private val ruleFactory: RuleFactory) {
    fun createRuleSetFromJson(json: String): RuleSet {
        val jsonObject = JsonParser.parseString(json).asJsonObject

        val id = jsonObject.get("id").asString
        val rulesJsonArray = jsonObject.getAsJsonArray("rule_set")

        val rules = rulesJsonArray.map { ruleJsonElement ->
            ruleFactory.createRule(ruleJsonElement.asJsonObject)
        }
        val chain = RuleSet(id = id, rules = rules.sortedBy { it.order })
        chain.linkChain()
        chain.executeChain(jsonObject)
        return  chain
    }
}