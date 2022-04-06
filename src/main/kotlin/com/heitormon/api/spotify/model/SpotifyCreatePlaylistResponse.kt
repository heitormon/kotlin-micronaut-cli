package com.heitormon.api.spotify.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

@Introspected
class SpotifyCreatePlaylistResponse {
    @JsonProperty("id")
    lateinit var playlistId: String
}
