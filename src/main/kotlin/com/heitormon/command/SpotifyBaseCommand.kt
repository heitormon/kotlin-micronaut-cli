package com.heitormon.command

import com.heitormon.api.spotify.client.SpotifyApiClientHttp
import com.heitormon.api.spotify.model.ProcessVariables
import io.micronaut.context.annotation.Value
import picocli.CommandLine
import picocli.CommandLine.Help.Visibility.ALWAYS
import picocli.CommandLine.Option
import picocli.CommandLine.Spec

open class SpotifyBaseCommand : Runnable {
    protected lateinit var playlistName: String
    protected var playlistSize: Int = 0

    @Value("\${spotify.api.oauth}")
    private lateinit var oauth: String

    @Spec
    protected var spec: CommandLine.Model.CommandSpec? = null

    @Option(names = ["--name", "-n"], description = ["Playlist Name"], required = true)
    open fun setPlaylistNameOption(name: String) {
        if (name.length > 90) {
            throw
            CommandLine.ParameterException(
                    spec?.commandLine(),
                    "Name parameter size limit is 90")
        }
        this.playlistName = "\uD83E\uDD16 $name"
    }

    @Option(names = ["--size", "-s"], description = ["Playlist size"], defaultValue = "10", showDefaultValue = ALWAYS)
    open fun setPlaylistSizeOption(size: Int) {
        this.playlistSize = size
    }

    override fun run() {
        println("Running Spotify Base Command")
    }

    protected fun setup(http: SpotifyApiClientHttp) {
        ProcessVariables.token = this.oauth
        ProcessVariables.user = http.getUserInfo().idUser
    }
}
