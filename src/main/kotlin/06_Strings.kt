@file:Suppress("unused", "RedundantExplicitType", "UNREACHABLE_CODE")

// Special type of class. Ignore for now.
private data class Person(val firstName: String, val lastName: String)

fun main() {

    val helloStr = "Hello"
    val worldStr = "World!"

    // String Templates
    val helloWorldStr: String = "$helloStr $worldStr"

    println(helloWorldStr)

    // Complex String templates
    val person = Person("John", "Doe")
    val personStr: String = "${person.firstName} ${person.lastName}"

    println(personStr)

    // Saves as written along with all the whitespace
    val rawString = """
for (c in "foo")
  print(c)
        """

    println(rawString)

    // Properly formatted Raw String using `|` and trimMargin()
    val formattedRawString = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(formattedRawString)
}

