package com.heitormon.api.spotify.model

import io.micronaut.core.annotation.Introspected

@Introspected
class SpotifyApiAuthResponse {
    lateinit var access_token: String
}
