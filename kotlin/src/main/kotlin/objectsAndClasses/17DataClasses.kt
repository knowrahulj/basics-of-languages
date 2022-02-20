package objectsAndClasses

// A class can be marked as a Data class whenever it is marked as ”data”
// This type of class can be used to hold the basic data apart. Other than this, it does not provide any other functionality.

data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {
    val book: Book = Book("Kotlin", "Rahul Jain", 5)
    println("Name of the Book is--"+book.name) // "Kotlin"
    println("Publisher Name--"+book.publisher) // "TutorialPoint.com"
    println("Review of the book is--"+book.reviewScore) // 5

    book.reviewScore = 7
    println("Printing all the info all together $book")

    //using inbuilt function of the data class
    println("Example of the hashCode function--"+book.hashCode())
}

