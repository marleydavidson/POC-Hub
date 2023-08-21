package com.example.hub.domain.rules

import com.google.gson.JsonObject

class RuleSet(val id: String,  val rules: List<Rule<*>>){

    fun executeChain(request: JsonObject) {
         rules.first().execute(request)
    }
    fun linkChain(){
        for (i in 0 until rules.size - 1) {
            rules[i].linkNextRule(rules[i+1])
        }
    }

}