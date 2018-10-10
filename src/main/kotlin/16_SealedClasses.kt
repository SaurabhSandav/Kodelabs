sealed class Result {

    // No arguments needed
    object Success : Result()

    // Arguments are needed
    data class Failure(val e: Exception) : Result()
}

fun main(args: Array<String>) {
    val result: Result = Result.Success

    // Not an Expression, no need to be Exhaustive
    when (result) {
        is Result.Failure -> println(result.e) // Result is smart casted to Result.Failure
    }

    // When used in an Expression, needs to be Exhaustive
    val toPrint = when (result) {
        Result.Success -> "Success!"
        is Result.Failure -> "Failure!"
    }

    println(toPrint)
}