package com.heitormon.api.spotify.model.dto

import com.fasterxml.jackson.annotation.JsonProperty

class SpotifyTrackResponse {
    @JsonProperty("tracks")
    lateinit var items: Items
}
