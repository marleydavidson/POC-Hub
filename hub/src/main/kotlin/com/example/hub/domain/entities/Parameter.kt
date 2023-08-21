package com.example.hub.domain.entities

data class Parameter(
        val path: List<MarkUp>,
        val query: List<MarkUp>,
        val body: List<MarkUp>
)