package com.heitormon.math.commands

import picocli.CommandLine.Option

abstract class OperationCommand : Runnable {
    @Option(names = ["-vars", "--variables"], description = ["List of variables. \nEx: {1,3,5}"], required = true)
    protected lateinit var variables: List<Int>

    override fun run() {
        println("Running Operation Command")
    }
}
