@file:Suppress(
    "VARIABLE_WITH_REDUNDANT_INITIALIZER", "UNREACHABLE_CODE", "ALWAYS_NULL",
    "UNNECESSARY_SAFE_CALL", "RedundantExplicitType"
)


fun main(args: Array<String>) {

    // Nullability is built into the Type system and is
    // denoted by adding a `?` after the Type declaration.
    var helloWorldStr: String? = "Hello World!"

    helloWorldStr = null

    println(helloWorldStr!!)
    println(helloWorldStr ?: "It's null!")

    helloWorldStr?.let { println(it) }


    var merryChristmasStr: String = "Merry Christmas!"

    //merryChristmasStr = null
}