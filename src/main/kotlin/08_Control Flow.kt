@file:Suppress(
    "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "ConstantConditionIf",
    "LiftReturnOrAssignment", "UNUSED_VALUE", "unused"
)

private fun checkIf() {
    val a = 2
    val b = 1
    var max = 0

    if (a > b) {
        max = a
    } else {
        max = b
    }

    // Is an Expression
    max = if (a > b) a else b
}

private fun checkWhen() {
    val a = 3
    val b = 1
    var max = 0

    when (a > b) {
        true -> max = a
        false -> max = b
    }

    val c: Any = a

    // Stupid example 😅
    // Executes the block associated with first condition that's satisfied
    when (c) {
        is String -> doSomethingElse()
        is Int, a > b -> max = a
        else -> { // Multiline code requires braces
            max = b
            doSomethingElse()
        }
    }

    // Is an Expression
    // Has to be Exhaustive
    max = when {
        a > b -> a
        else -> b
    }
}

private fun doSomethingElse(): Nothing = TODO()