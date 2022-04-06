package com.heitormon.api.spotify.client

import com.heitormon.api.spotify.annotation.BasicAuth
import com.heitormon.api.spotify.model.SpotifyApiAuthResponse
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client

@BasicAuth
@Client("\${spotify.api.auth.url}")
interface SpotifyAuthClientHttp {
    @Post("/api/token")
    fun getToken(): SpotifyApiAuthResponse
}
