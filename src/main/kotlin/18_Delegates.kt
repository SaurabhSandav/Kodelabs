import kotlin.properties.Delegates

class User {
    var observableVar: String
            by Delegates.observable("<no value>") { prop, old, new ->
                println("$old -> $new")
            }

    val lazyVar: String by lazy {
        println("Initializing String...")
        ""
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.observableVar = "first"
    user.observableVar = "second"

    println()

    println(user.lazyVar)
    println(user.lazyVar)
}