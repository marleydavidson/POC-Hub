package com.example.hub.application.dtos

data class ApiConsumerDTO(
        val url: String,
        val body: String,
        val parameters: Map<String, String>,
        val headers: Map<String, String>,
        val contextOutput: String
)