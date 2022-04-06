package com.heitormon.command

import com.heitormon.api.spotify.client.SpotifyAuthClientHttp
import com.heitormon.api.spotify.model.ProcessVariables
import jakarta.inject.Inject

open class SpotifyBaseCommand : Runnable {
    @Inject
    lateinit var spotifyAuthClientHttp: SpotifyAuthClientHttp

    override fun run() {
        println("Running Spotify Base Command")
    }

    protected fun setup() {
        ProcessVariables.token = spotifyAuthClientHttp.getToken().access_token
    }
}
