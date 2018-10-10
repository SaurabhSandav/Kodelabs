fun main(args: Array<String>) {
    val stringArray: Array<String> = arrayOf(
        "Lorem", " Ipsum", " is", " simply", " dummy", " text",
        " of", " the", " printing", " and", " typesetting", " industry."
    )

    for (item in stringArray) print(item)

    println()

    // Simple Ranges
    for (i in 1..10) print("$i ")

    println()

    // Loop the other way printing every other element
    for (i in 10 downTo 1 step 2) print("$i ")

    // while and do-while loops exist along with break and continue keywords
}