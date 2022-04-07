package com.heitormon.api.spotify.client

import com.heitormon.api.spotify.annotation.BearerToken
import com.heitormon.api.spotify.model.dto.*
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@BearerToken
@Client("\${spotify.api.url}")
interface SpotifyApiClientHttp {
    @Get("/v1/search/")
    fun searchByGenre(@QueryValue q: String, @QueryValue type: String): SpotifyTrackResponse

    @Get("/v1/me")
    fun getUserInfo(): SpotifyUserResponse

    @Post("/v1/users/{user}/playlists")
    fun createPlaylist(@PathVariable(name = "user") user: String, @Body spotifyCreatePlaylistRequest: SpotifyCreatePlaylistRequest): SpotifyCreatePlaylistResponse

    @Post("/v1/playlists/{playlist_id}/tracks")
    fun addTrackInPlaylist(@PathVariable(name = "playlist_id") playlistId: String, @Body spotifyAddTrackPlaylistRequest: SpotifyAddTrackPlaylistRequest)

}
