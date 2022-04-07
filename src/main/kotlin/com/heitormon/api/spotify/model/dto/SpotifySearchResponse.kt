package com.heitormon.api.spotify.model.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

@Introspected
class Items {
    @JsonProperty("items")
    lateinit var results: List<Result>
}

@Introspected
class Result {
    @JsonProperty("uri")
    lateinit var link: String

    @JsonProperty("name")
    lateinit var name: String

    @JsonProperty("popularity")
    lateinit var popularity: String

    override fun toString(): String {
        return "Link: ${link}," +
                "Name: ${name}," +
                "Popularity: ${popularity},"
    }
}
