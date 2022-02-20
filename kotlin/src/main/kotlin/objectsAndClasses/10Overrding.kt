package objectsAndClasses

// If a child class inherits multiple implementations of the same member from its immediate superclasses,
// then it must override this member and provide its own implementation.

// This is different from a child class which inherits members from a single parent,
// in such case it is not mandatory for the child class to provide the implementation of all the open members.

open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}