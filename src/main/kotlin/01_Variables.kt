@file:Suppress(
    "UNUSED_VARIABLE", "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE",
    "UNUSED_VALUE", "RedundantExplicitType", "unused"
)

// In v1.3 you can skip the arguments
fun main(/*args: Array<String>*/) {

    // Immutable
    val finalStr: String = "String can't be changed"

    //finalStr = "Changed!"

    // Mutable
    var variableStr: String = "String can be changed"

    variableStr = "Changed!"
}


// Similar to `static final`
private const val SAMPLE_CONSTANT = "SAMPLE_CONSTANT"