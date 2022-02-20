package objectsAndClasses

// When a nested class is marked with a keyword inner, then it will be called as an Inner class.
// An inner class can be accessed by the data member of the outer class.

// Unlike a nested class, inner class can access members of the outer class.
// We cannot directly create an object of the inner class, but it can be created using the outer class object.
class OuterClass {
    private val welcomeMessage: String = "I am a inner class"
    inner class Inner {
        fun foo() = welcomeMessage
    }
}

fun main(args: Array<String>) {
    val obj = OuterClass().Inner()

    print(obj.foo())
}