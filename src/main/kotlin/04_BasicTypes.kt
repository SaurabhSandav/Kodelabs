@file:Suppress("unused", "MayBeConstant")

// Note: Variables can be outside a class.

// No primitive types in code
// Compiler handles Autoboxing and unboxing

// Numbers are optimized to primitives
/** Double, Float, Long, Int, Short, Byte, Boolean **/

// Nullable numbers are boxed to java.lang equivalents (E.g. java.lang.Integer)
/** Double?, Float?, Long?, Int?, Short?, Byte?, Boolean? **/

// Chars and Strings
/** Char, String **/

// Unsigned types available in 1.3
// Still Experimental and therefore require @ExperimentalUnsignedTypes annotation
/** UByte, UShort, UInt, ULong **/

// Underscores in numbers for readability
private val oneMillion = 1_0_00_00

//>> ***** Other important types ***** <<//

// Similar to void but it's a type and value at the same time unlike (void and Void)
private val unit: Unit = Unit

// Supertype of everything. Similar to java.lang.Object
private val anyOne: Any = "SampleString"
private val anyTwo: Any = 120

// Subtype of everything
// From the docs : represent "a value that never exists": for example, if a function
// has the return type of Nothing, it means that it never returns (always throws
// an exception). Useful in certain cases. Ignore for now
private val nothing: Nothing = TODO()

fun doSomething(): Nothing = TODO()
/*

fun main(args: Array<String>) {
    doSomething()

    println("HEllo!")
}
*/

