package objectsAndClasses

// Everything in Kotlin is by default final.
// Hence, we need to use the keyword open in front of the class declaration to make it inheritable for other classes.
open class ABC {
    open val count: Int = 0

    open fun think () {
        println("Hey!! i am thinking ")
    }
}

class BCD: ABC() { // inheritance happens using default constructor
    // You can also override a val property with a var property, but not vice versa
    override val count: Int

    init{
        count = 100
    }

    override fun think() {
        println("I am from Child")
    }

    fun displayCount(){
        println("Count value is $count")
    }
}

// can use the override keyword as part of the property declaration in a primary constructor
class CDE(override val count: Int = 400): ABC() {

    override fun think() {
        println("I am from Child")
    }

    fun displayCount(){
        println("Count value is $count")
    }
}

fun main(args: Array<String>) {
    val  a = BCD()
    a.think()

    val b = CDE(200)
    val c = CDE()
    b.displayCount()
    c.displayCount()
}