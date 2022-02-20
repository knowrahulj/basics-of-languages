package objectsAndClasses

// Delegation means passing the responsibility to another class or method.
// When a property is already declared in some places, then we should reuse the same code to initialize them

// Using Lazy()
// Lazy is a lambda function which takes a property as an input and in return gives an instance of Lazy<T>, where <T> is basically the type of the properties it is using.
val myVar: String by lazy {
    "Hello"
}

fun main(args: Array<String>) {
    println("$myVar My dear friend")
}
