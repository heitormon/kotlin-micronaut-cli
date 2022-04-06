package com.heitormon.api.spotify.filter

import com.heitormon.api.spotify.annotation.BearerToken
import com.heitormon.api.spotify.model.ProcessVariables
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpRequest
import io.micronaut.http.filter.ClientFilterChain
import io.micronaut.http.filter.HttpClientFilter
import jakarta.inject.Singleton
import org.reactivestreams.Publisher

@BearerToken
@Singleton
class BearerTokenFilter() : HttpClientFilter {

    override fun doFilter(request: MutableHttpRequest<*>?, chain: ClientFilterChain?): Publisher<out HttpResponse<*>>? {
        return chain?.proceed(
                request?.bearerAuth(ProcessVariables.token))
    }
}
