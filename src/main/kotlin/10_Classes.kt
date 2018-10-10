@file:Suppress("unused", "UNUSED_PARAMETER", "CanBeParameter")

// No Body or Arguments
private class NoBody

// No Body
private class NoBodyWithArg(var someArg: String) {

    //constructor()
}

// When you need to put annotations on the constructor
private class WithAnnotationOnConstructor @SampleAnnotation constructor(val someArg: String)

// When you need to change the visibility of the constructor
private class WithPrivateConstructor private constructor(val someArg: String)

private class WithInit(val someArg: String) {

    val ss: String

    init {
        someArg
        ss = ""
        // Same as a Java constructor
        // Can initialize variables and other Stuff
        // Classes can have multiple init blocks executed in order
    }

    init {

    }
}

private class WithPrimaryAndSecondaryConstructors(val someArg: String) {

    constructor(someArg: String, someOtherArg: Int) : this(someArg) {
        TODO()
    }
}

private class WithMultipleConstructors {

    constructor(someArg: String)

    constructor(someOtherArg: Int)
}

// Initializing Classes
private val example = NoBody()

// Bonus: Declaring Annotations
annotation class SampleAnnotation