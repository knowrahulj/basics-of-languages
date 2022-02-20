package objectsAndClasses

// Using extension, we will be able to add or remove some method functionality even without inheriting or modifying them.
// Extensions are resolved statistically.
// It does not actually modify the existing class, but it creates a callable function that can be called with a dot operation.

class Alien {
    var skills : String = "null"

    fun printMySkills() {
        println(skills)
    }
}

fun Alien.addMySkills(a:Alien):String{
    val a4 = Alien()
    a4.skills = this.skills + " " +a.skills
    return a4.skills
}

fun main(args: Array<String>) {
    val  a1 = Alien()
    a1.skills = "JAVA"
    a1.printMySkills()

    val  a2 = Alien()
    a2.skills = "SQL"
    a2.printMySkills()

    val  a3 = Alien()
    a3.skills = a1.addMySkills(a2)
    a3.printMySkills()
}