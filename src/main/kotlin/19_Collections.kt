private val stringList: MutableList<String> = mutableListOf(
    "Lorem", " Ipsum", " is", " simply", " dummy", " text",
    " of", " the", " printing", " and", " typesetting", " industry."
)

fun main(args: Array<String>) {


    val newList = stringList
        .filter { it.length > 7 }
        .map { it.length }

    println(newList)
}