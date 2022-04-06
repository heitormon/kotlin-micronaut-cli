package com.heitormon.api.spotify.model

import com.fasterxml.jackson.annotation.JsonProperty

class SpotifyUserResponse {
    @JsonProperty("id")
    lateinit var idUser: String
}
