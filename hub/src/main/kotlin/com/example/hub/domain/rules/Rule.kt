package com.example.hub.domain.rules

import com.google.gson.JsonObject

interface Rule<T> {
    val order: Int
    fun execute(request: JsonObject): T
}