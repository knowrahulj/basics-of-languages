package objectsAndClasses

// Kotlin provides higher order of variable typing called as Generics.
// Implementation wise, generics is pretty similar to Java but Kotlin developer has introduced two new keywords “out” and “in” to make Kotlin codes more readable and easy for the developer.

// In Kotlin, a class and a type are totally different concepts.
// As per the example, List is a class in Kotlin, whereas List<String> is a type in Kotlin.
fun main(args: Array<String>) {
    generic()

    var object0 = GenericsExample<String>("JAVA")
    var object1 = GenericsExample<Int>(10)
}

fun generic() {
    // we have declared one “integer” and later we have assigned that variable to a number variable.
    // This is possible because “Int” is a subclass of Number class, hence the type conversion happens automatically at runtime
    val integer: Int = 1
    val number: Number = integer
    print(number)
}

class GenericsExample<T>(input:T) {
    init {
        println("I am getting called with the value $input")
    }
}

// When we want to assign the generic type to any of its super type, then we need to use “out” keyword
// when we want to assign the generic type to any of its sub-type, then we need to use “in” keyword.

class OutGenericsExample<out T>(input:T) {
    init {
        println("I am getting called with the value $input")
    }
}

class InGenericsExample<in T>(input:T) {
    init {
        println("I am getting called with the value $input")
    }
}