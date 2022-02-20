package objectsAndClasses

open class BaseClass() {
    open val name:String
    init{
        name = "Base"
    }

    open fun displayName(){
        println("I am in " +  this.name)
    }
}
class ChildClass(): BaseClass() {
    override fun displayName(){
        super.displayName()
        println("I am in " + super.name)

    }
}

fun main(args: Array<String>) {
    val a = ChildClass()
    a.displayName()
}

// Output
//I am in Base
//I am in Base