package com.heitormon

import io.micronaut.context.ApplicationContext
import io.micronaut.context.env.Environment
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import java.io.ByteArrayOutputStream
import java.io.PrintStream

@TestInstance(Lifecycle.PER_CLASS)
abstract class BaseCommandTest {
    protected lateinit var applicationContext: ApplicationContext
    protected lateinit var byteArrayOutputStream: ByteArrayOutputStream

    @BeforeAll
    fun setup() {
        applicationContext = ApplicationContext.run(Environment.CLI, Environment.TEST)
    }

    @BeforeEach
    fun init() {
        byteArrayOutputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(byteArrayOutputStream))

    }

    @AfterAll
    fun tearDown() {
        applicationContext.close()
    }
}
