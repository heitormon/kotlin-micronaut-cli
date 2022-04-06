package com.heitormon.command

import com.heitormon.api.spotify.client.SpotifySearchClientHttp
import jakarta.inject.Inject
import picocli.CommandLine.Command

@Command(name = "create-playlist-by-genre", description = ["Create Spotify Playlist From Genre"],
        mixinStandardHelpOptions = true)
class CreatePlaylist : SpotifyBaseCommand() {
    @Inject
    lateinit var spotifySearchClientHttp: SpotifySearchClientHttp

    override fun run() {
        println("Running Spotify Youtube Command")
        setup()
        val searchArtist = spotifySearchClientHttp.searchArtist("Bruno Mars", "artist")
        for (artist in searchArtist.items.artists) println(artist)
    }
}
