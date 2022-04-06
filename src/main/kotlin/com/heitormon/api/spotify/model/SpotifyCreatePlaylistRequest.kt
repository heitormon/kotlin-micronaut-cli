package com.heitormon.api.spotify.model

import io.micronaut.core.annotation.Introspected

@Introspected
class SpotifyCreatePlaylistRequest(
        val name: String,
        val description: String,
        val public: Boolean,
        val collaborative: Boolean,
) {
}
