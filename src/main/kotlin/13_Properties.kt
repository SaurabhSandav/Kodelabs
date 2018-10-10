@file:Suppress("unused")

// Kotlin does not have simple fields and instead has properties.
// Properties create implicit getters and setters for all fields and can be overridden
// at anytime.
private class SampleClass {

    var simpleProperty: String = "Simple Property"

    // val properties cannot have setters
    val valueProperty: String = "Merry Christmas!"
        get() = "$field!!"
    /*set(value) {
            println("Getter called!")
            // You can access the backing field
            field = value
        }*/

    var variableProperty: String = "Hello World!"
        set(value) {
            println("Setter called!")
            // You can access the backing field
            field = value
        }
        get() {
            //println("Getter called!")
            return "$field!!"
        }

}

fun main(args: Array<String>) {
    val sample = SampleClass()

    //println(sample.variableProperty)

    sample.variableProperty = "Property Changed!"
    //sample.valueProperty = "Property Changed!"

    println(sample.variableProperty)
}