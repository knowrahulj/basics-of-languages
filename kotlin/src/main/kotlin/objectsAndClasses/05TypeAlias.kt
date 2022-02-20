package objectsAndClasses

// Kotlin Type Aliases means a way to give an alternative name to an existing type.
// Type alias provides a cleaner way to write a more readable code.

typealias User = Triple<String, String, Int>

fun main() {
    val obj = userInfo()

    print(obj)
}

fun userInfo():User{
    return Triple("Zara","Ali",21)
}