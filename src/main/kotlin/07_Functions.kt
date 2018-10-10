@file:Suppress("unused", "UNNECESSARY_SAFE_CALL", "RedundantUnitReturnType")

// Note: Functions can be outside a class.

/** Functions are declared using the `fun` keyword **/

// Functions Arguments are vals
private fun customPrint(str: String) {
    println(str)
}

//private fun adder(a: Int, b: Int) = a + b


/** LAMBDAS **/

fun main(args: Array<String>) {

    doSomethingT(
        str = "Hi!"
    )
}

fun doSomethingT(str: String = "Hello World!") {
    println(str)
}