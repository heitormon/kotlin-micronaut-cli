package com.heitormon.api.spotify.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

@Introspected
class SpotifySearchResponse {
    @JsonProperty("artists")
    lateinit var items: Items
}
@Introspected
class Items {
    @JsonProperty("items")
    lateinit var artists: List<Artist>
}
@Introspected
class Artist {
    @JsonProperty("href")
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
