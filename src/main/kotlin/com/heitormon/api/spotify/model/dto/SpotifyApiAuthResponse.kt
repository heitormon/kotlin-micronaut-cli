package com.heitormon.api.spotify.model.dto

import io.micronaut.core.annotation.Introspected

@Introspected
class SpotifyApiAuthResponse {
    lateinit var access_token: String
}
