@file:Suppress("unused", "UNUSED_EXPRESSION", "UNUSED_PARAMETER")

// Note you can have Classes, Interfaces, functions, variables and other stuff
// in the same file at the top level

// Kotlin classes are final by default. Use open keyword to make it non-final
private open class Parent(surname: String)

private interface Playable {
    fun play()
}

// Extending Classes and interface is similar using a `:`
// `surname` is only available in the init  block or class level variables as it's
// neither a `var` nor a `val`.
private class Child(val firstName: String, surname: String) : Parent(surname), Playable {

    val mySurname = surname

    init {
        surname
    }

    // No @Override annotation. It's a keyword instead.
    override fun play() {
        //surname
    }

    // Classes with inner keyword have access to the outside Classes's state
    inner class SampleInnerClass() {
    }
}