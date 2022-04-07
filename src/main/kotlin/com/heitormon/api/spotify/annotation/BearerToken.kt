package com.heitormon.api.spotify.annotation

import io.micronaut.http.annotation.FilterMatcher
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.VALUE_PARAMETER

@FilterMatcher
@MustBeDocumented
@Retention(RUNTIME)
@Target(CLASS, VALUE_PARAMETER)
annotation class BearerToken
