package com.example.hub

import com.example.hub.domain.entities.enums.RuleType
import com.example.hub.domain.rules.ApiConsumerRule
import com.example.hub.domain.rules.DatabaseRule
import com.example.hub.domain.rules.ValueValidationRule
import com.example.hub.domain.usecases.RuleSetService
import com.google.gson.Gson
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class RuleServiceTest {

    @Autowired
    lateinit var ruleSetService: RuleSetService

    @Test
    fun `convert JSON to ApiConsumerRule object`() {

        val convertedObject = Gson().fromJson(JSONs.API_CONSUMER_RULE_JSON, ApiConsumerRule::class.java)

        assertEquals(1, convertedObject.order)
        assertEquals("https://alguma.api.com.br/algum/path/{id}", convertedObject.url)
        assertEquals(RuleType.API_CONSUMER.name, convertedObject.rule)
    }

    @Test
    fun `convert JSON to ValueValidationRule object`() {

        val convertedObject = Gson().fromJson(JSONs.VALUE_VALIDATION_RULE_JSON, ValueValidationRule::class.java)

        assertEquals(2, convertedObject.order)
    }

    @Test
    fun `convert JSON to DataBaseRule object`() {

        val convertedObject = Gson().fromJson(JSONs.DATA_BASE_RULE_JSON, DatabaseRule::class.java)

        assertEquals(3, convertedObject.order)
        assertEquals(RuleType.DATA_BASE.name, convertedObject.rule)
    }

    @Test
    fun `should create RuleSet from JSON`() {

        val expectedRuleSetId = "rulesetId"
        val expectedRuleSetSize = 3

        val result = ruleSetService.createRuleSetFromJson(JSONs.COMPOST_JSON)

        assertEquals(expectedRuleSetId, result.id)
        assertEquals(expectedRuleSetSize, result.rules.size)

    }


}