package objectsAndClasses

import kotlin.properties.Delegates

// Observable() takes two arguments to initialize the object and returns the same to the called function.

class User1 {
    var name: String by Delegates.observable("Welcome") {
            prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val user = User1()
    user.name = "first"
    user.name = "second"
}

// output
// Welcome -> first
// first -> second