package objectsAndClasses

// This type of class is used to represent a restricted class hierarchy.
// Sealed allows the developers to maintain a data type of predefined type.
// A sealed class can have its own subclass but all those subclasses need to be declared inside the same Kotlin file along with the sealed class

sealed class MyExample {
    class OP1 : MyExample() // MyExmaple class can be of two types only
    class OP2 : MyExample()
}

fun main(args: Array<String>) {
    val obj: MyExample = MyExample.OP2()

    val output = when (obj) { // defining the object of the class depending on the inuputs
        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "option Two has been chosen"
    }

    println(output)
}