package objectsAndClasses

// Kotlin allows you to declare multiple variables at once. This technique is called Destructuring declaration.
fun main(args: Array<String>) {
    val s = Student("Rahul","Kotlin")
    val (name, subject) = s
    println("You are learning $subject from $name")
}

data class Student( val a :String,val b: String ){
    var name:String = a
    var subject:String = b
}