package com.heitormon

import com.heitormon.math.commands.AdditionCommand
import io.micronaut.configuration.picocli.PicocliRunner
import picocli.CommandLine.Command

@Command(subcommands = [AdditionCommand::class], mixinStandardHelpOptions = true)
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
