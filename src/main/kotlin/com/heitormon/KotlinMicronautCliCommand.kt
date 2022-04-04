package com.heitormon

import com.heitormon.math.commands.AdditionCommand
import io.micronaut.configuration.picocli.PicocliRunner
import picocli.CommandLine.Command
import picocli.CommandLine.Option

@Command(subcommands = [AdditionCommand::class])
class KotlinMicronautCliCommand : Runnable {
    override fun run() {
        println("Welcome to Kotlin Micronaut Cli")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            PicocliRunner.run(KotlinMicronautCliCommand::class.java, *args)
        }
    }
}
