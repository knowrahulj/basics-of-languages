package objectsAndClasses

// Kotlin provides another mechanism to implement static functionality of Java.
// This can be achieved using the keyword “companion object”.
// Using this mechanism, we can create an object of a class inside a factory method
// later we can just call that method using the reference of the class name.

fun main(args: Array<String>) {
    println("Heyyy!!!"+Ex.show())
}

class Ex {
    companion object {
        fun show():String {
            return("This is extension")
        }
    }
}