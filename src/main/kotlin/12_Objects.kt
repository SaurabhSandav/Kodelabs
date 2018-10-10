// Objects are application level Singletons built into the language.
private object SampleObject {
    const val name = "SampleObject"
}


// Companions objects are similar to objects but are associated with the outer class
// They allow you call methods and access properties directly on the class without
// instantiation similar to java's Static methods.
private class CompanionsObjectSample {

    companion object {
        private const val name = "CompanionsObjectSample"

        fun getName() = name
    }
}

fun main(args: Array<String>) {
    println(SampleObject.name)
    println(CompanionsObjectSample.getName())
}