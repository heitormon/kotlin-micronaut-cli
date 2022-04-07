package com.heitormon.api.spotify.model.dto

import com.fasterxml.jackson.annotation.JsonProperty

class SpotifyUserResponse {
    @JsonProperty("id")
    lateinit var idUser: String
}
