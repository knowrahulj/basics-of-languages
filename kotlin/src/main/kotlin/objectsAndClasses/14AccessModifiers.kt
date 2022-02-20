package objectsAndClasses

// The Kotlin visibility modifiers are the keywords that set the visibility of classes, objects, interface, constructors, functions as well as properties and their setters.
// Though getters always have the same visibility as their properties, so we can not set their visibility.

/*There are four visibility modifiers in Kotlin:
public (default)
private
protected - A protected class or interface or properties or function is visible to the class itself and it's subclasses only.
internal - An Internal package is visible only inside the module under which it is implemented.
           An internal class interface is visible only by other class present inside the same package or the module.
 */

open class AClass() {
    private val i = 1

    fun doSomething(){
        println("Inside doSomething" )
        println("Value of i is $i" )
    }
}
class BClass : AClass() {
    fun printValue(){
        doSomething()
        // println("Value of i is $i" )
    }
}

fun main(args: Array<String>) {
    val a = AClass()
    val b = BClass()

    b.printValue()
}
