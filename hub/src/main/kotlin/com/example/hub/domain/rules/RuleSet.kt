package com.example.hub.domain.rules

import com.google.gson.JsonObject

class RuleSet(val id: String,  val rules: List<Rule<*>>){

    fun executeChain(request: JsonObject) {
         rules.first().execute(request)
    }
    fun linkChain() {
        System.out.println("Criando a cadeia...")
        for (i in 0 until rules.size - 1) {
            System.out.println("Adicionando a rule:"+ rules[i].javaClass.name+" Na cadeia")
            rules[i].linkNextRule(rules[i+1])
        }
        System.out.println("Cadeia criada com sucesso...")
    }

}