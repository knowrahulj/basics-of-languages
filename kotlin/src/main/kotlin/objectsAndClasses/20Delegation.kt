package objectsAndClasses

// Kotlin supports “delegation” design pattern by introducing a new keyword “by”
// Kotlin allows the derived class to access all the implemented public methods of an interface through a specific object.

interface BaseC {
    fun printMe() //abstract method
}

class BaseImpl(val x: Int) : BaseC {
    override fun printMe() { println(x) }   //implementation of the method
}

class Derived(b: BaseC) : BaseC by b  // delegating the public method on the object b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).printMe() // prints 10 :: accessing the printMe() method
}