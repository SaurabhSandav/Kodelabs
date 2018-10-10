fun main(args: Array<String>) {

    println("John".sayHello())
}

// Add additional functionality to library classes or for simplifying code.
// Compiled to static sayHello(String). Can only access public fields and methods
private fun String.sayHello() = "Hello $this!"