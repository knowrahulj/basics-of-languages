package objectsAndClasses

interface ExampleInterface  {
    var myVar: Int            // abstract property
    fun absMethod():String    // abstract method

    // method with default implementation
    fun hello() {
        println("Hello!")
    }
}

class InterfaceImp : ExampleInterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning "
}

fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("My Variable Value is = ${obj.myVar}")
    print("Calling hello(): ")
    obj.hello()

    print("Message from the Website-- ")
    println(obj.absMethod())
}