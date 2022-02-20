package objectsAndClasses

class MyClass {
    // Property (data member)
    private var name: String = "Rahul Jain"

    // Member function
    fun printMe() {
        print("My name is $name")
    }
}

fun main(args: Array<String>) {
    val obj = MyClass() // Create object obj of myClass class
    obj.printMe() // Call a member function using object
}