package com.heitormon.api.spotify.model.dto

import io.micronaut.core.annotation.Introspected

@Introspected
class SpotifyAddTrackPlaylistRequest(
        val uris: List<String>,
)
