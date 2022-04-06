package com.heitormon.api.spotify.model

import com.fasterxml.jackson.annotation.JsonProperty

class SpotifyTrackResponse {
    @JsonProperty("tracks")
    lateinit var items: Items
}
