package objectsAndClasses


// Every Kotlin class needs to have a constructor and if we do not define it, then the compiler generates a default constructor.
// A Kotlin class can have two type of constructors:
//Primary Constructor-
//  initializes the class
//  can be declared at class header level
//  constructor keyword can be omitted if there is no annotations or access modifiers specified like public, private or protected
//  cannot contain any code. Initialization code can be placed in initializer blocks prefixed with the init keyword
//  There could be more than one init blocks and during the initialization of an instance,
//      the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers:
//Second Constructors-
//  helps to include some extra logic while initializing the class.
//
class Person (val _name: String, val _age: Int = 20) {
    // Member Variables
    var name: String
    var age: Int

    // Initializer Block
    init {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

class SalariedPerson{
    // Member Variables
    var name: String
    var age: Int
    var salary:Double

    // First Secondary Constructor
    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
    }

    // Second Secondary Constructor
    constructor ( _name: String, _age: Int, _salary: Double) {
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}

fun main(args: Array<String>) {
    val person = Person("Zara", 20)
    val salariedPerson1 = SalariedPerson("Rahul", 25)
    val salariedPerson2 = SalariedPerson("Rahul", 25, 10000.0)
}