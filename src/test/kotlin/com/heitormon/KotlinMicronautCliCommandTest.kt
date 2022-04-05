package com.heitormon

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

@MicronautTest
internal class KotlinMicronautCliCommandTest : BaseCommandTest() {

    @Test
    fun executeMainCommand() {
        PicocliRunner.run(KotlinMicronautCliCommand::class.java, applicationContext)

        assertTrue(byteArrayOutputStream.toString().contains("Welcome to Kotlin Micronaut Cli"))
    }

    @Test
    fun executeAdditionCommand() {
        val args = arrayOf("addition --variables {1,2,3}")

        PicocliRunner.run(KotlinMicronautCliCommand::class.java, applicationContext, "addition", "--variables", "6")

        assertTrue(byteArrayOutputStream.toString().contains("6"))
    }
}
