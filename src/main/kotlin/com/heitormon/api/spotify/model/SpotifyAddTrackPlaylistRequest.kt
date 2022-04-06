package com.heitormon.api.spotify.model

import io.micronaut.core.annotation.Introspected

@Introspected
class SpotifyAddTrackPlaylistRequest(
        val uris: List<String>,
) {
}
