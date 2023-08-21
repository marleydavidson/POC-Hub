package com.example.hub.domain.rules

import com.google.gson.JsonObject

interface Rule<T> {
    val order: Int
    var nextRule: Rule<*>?
    fun execute(request: JsonObject): T

    fun linkNextRule(rule: Rule<*>)
}