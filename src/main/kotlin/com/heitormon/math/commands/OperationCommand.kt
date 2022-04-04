package com.heitormon.math.commands

import picocli.CommandLine

abstract class OperationCommand : Runnable {
    protected var firstVariable: Int = 0
    protected var secondVariable: Int = 0

    @CommandLine.Spec
    protected lateinit var spec: CommandLine.Model.CommandSpec

    @JvmName("setFirstVariable")
    @CommandLine.Option(names = ["--first"], description = ["first variable"], required = true)
    fun setFirstVariable(any: String) {
        if (isNumeric(any)) {
            this.firstVariable = any.toInt()
        } else {
            throw CommandLine.ParameterException(spec.commandLine(), "Variable must be a Int value: $any")
        }
    }

    @JvmName("setSecondVariable")
    @CommandLine.Option(names = ["--second"], description = ["first variable"], required = true)
    fun setSecondVariable(any: String) {
        if (isNumeric(any)) {
            this.secondVariable = any.toInt()
        } else {
            throw CommandLine.ParameterException(spec.commandLine(), "Variable must be a Int value: $any")
        }
    }

    override fun run() {
        println("Running Operation Command")
    }

    private fun isNumeric(toCheck: String): Boolean {
        return toCheck.all { char -> char.isDigit() }
    }
}
