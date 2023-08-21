package com.example.hub.domain.entities

import com.google.gson.annotations.SerializedName

data class Header(
        val variable: String,
        val value: String,
        @SerializedName("value_interpolation")
        val valueFromContext: String? = null,
        @SerializedName("value_from_context")
        val valueInterpolation: String? = null
)