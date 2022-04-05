package com.heitormon.math.commands

import io.micronaut.configuration.picocli.PicocliRunner
import picocli.CommandLine.Command

@Command(name = "addition", description = ["Simple Math Operations"],
        mixinStandardHelpOptions = true)
class AdditionCommand : OperationCommand() {
    override fun run() {
        println("Result from operation: ${variables.sum()}")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            PicocliRunner.run(AdditionCommand::class.java, *args)
        }
    }
}
