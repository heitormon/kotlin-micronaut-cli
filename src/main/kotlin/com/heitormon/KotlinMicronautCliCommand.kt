package com.heitormon

import com.heitormon.command.CreatePlaylist
import io.micronaut.configuration.picocli.PicocliRunner
import picocli.CommandLine.Command

@Command(subcommands = [CreatePlaylist::class], mixinStandardHelpOptions = true)
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
