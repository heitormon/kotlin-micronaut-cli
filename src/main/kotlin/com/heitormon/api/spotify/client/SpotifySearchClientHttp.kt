package com.heitormon.api.spotify.client

import com.heitormon.api.spotify.annotation.BearerToken
import com.heitormon.api.spotify.model.SpotifySearchResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

@BearerToken
@Client("\${spotify.api.artist.url}")
interface SpotifySearchClientHttp {
    @Get("/v1/search/")
    fun searchArtist(@QueryValue q: String, @QueryValue type: String): SpotifySearchResponse
}
