package objectsAndClasses

// When we create an object of a derived class then constructor initialization starts from the base class.
// Which means first base class properties will be initialized, after that any derived class instructor will be called
// and same applies to any further derived classes.

open class Base {
    init{
        println("I am in Base class")
    }
}

open class Child: Base() {
    init{
        println("I am in Child class")
    }
}

class GrandChild: Child() {
    init{
        println("I am in Grand Child class")
    }
}

fun main(args: Array<String>) {
    var a = GrandChild()
}

// Output
//I am in Base class
//I am in Child class
//I am in Grand Child class