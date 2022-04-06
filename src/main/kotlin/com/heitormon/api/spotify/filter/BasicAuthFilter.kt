package com.heitormon.api.spotify.filter

import com.heitormon.api.spotify.annotation.BasicAuth
import io.micronaut.context.annotation.Value
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpRequest
import io.micronaut.http.filter.ClientFilterChain
import io.micronaut.http.filter.HttpClientFilter
import jakarta.inject.Singleton
import org.reactivestreams.Publisher

@BasicAuth
@Singleton
class BasicAuthFilter
//(@param:Value("\${spotify.api.auth.client_id}") val clientId: String,
//                      @param:Value("\${spotify.api.auth.client_secret}") val clientSecret: String)
    : HttpClientFilter {
    private val clientId: String
    private val clientSecret: String

    constructor(@Value("\${spotify.api.auth.client_id}") clientId: String,
                @Value("\${spotify.api.auth.client_secret}") clientSecret: String) {
        this.clientId = clientId
        this.clientSecret = clientSecret
    }

    override fun doFilter(request: MutableHttpRequest<*>?, chain: ClientFilterChain?): Publisher<out HttpResponse<*>>? {
        return chain?.proceed(
                request?.basicAuth(clientId, clientSecret)
                        ?.header("Content-Type", MediaType.APPLICATION_FORM_URLENCODED)
                        ?.body(mapOf("grant_type" to "client_credentials")))
    }
}
