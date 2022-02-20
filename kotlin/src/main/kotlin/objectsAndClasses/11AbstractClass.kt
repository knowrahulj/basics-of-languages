package objectsAndClasses

// A Kotlin abstract class is similar to Java abstract class which can not be instantiated.
// This means we cannot create objects of an abstract class. However, we can inherit subclasses from a Kotlin abstract class.
// The properties and methods of an abstract class are non-abstract unless we explicitly use abstract keyword to make them abstract.
// Abstract classes are always open. You do not need to explicitly use open keyword to inherit subclasses from them.

abstract class PersonA(_name: String) {
    var name: String
    abstract var age: Int

    // Initializer Block
    init {
        this.name = _name
    }

    abstract fun setPersonAge(_age:Int)
    abstract fun getPersonAge():Int

    fun getPersonName(){
        println("Name = $name")
    }
}
class Employee(_name: String): PersonA(_name) {
    override var age: Int = 0

    override fun setPersonAge(_age: Int) {
        age = _age
    }
    override fun getPersonAge():Int {
        return age
    }
}

fun main(args: Array<String>) {
    val employee = Employee("Rahul")

    employee.setPersonAge(20)

    val age : Int = employee.getPersonAge()
    employee.getPersonName()
    println("Age = $age")
}
