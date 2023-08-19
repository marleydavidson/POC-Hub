package com.example.hub.domain.entities

data class Header(
        val variable: String,
        val value: String,
        val valueInterpolation: String? = null,
        val valueFromContext: String? = null
)