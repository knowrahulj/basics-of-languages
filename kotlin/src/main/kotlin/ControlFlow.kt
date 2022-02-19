fun main() {
    ifelse()
    whenExpression()
    expressionInWhen()
    forLoop()
    whileLoop()
    breakAndContinue()
}

fun ifelse() {
    val age:Int = 10

    var result = if (age > 18) {
        "Adult"
    } else {
        "Minor"
    }
    println(result)

    // skip curly braces
    result = if (age > 18) "Adult" else  "Minor"
    println(result)

    // multiple statements in if...else block, in this case the last expression is returned as the value of the block.
    result = if (age > 18) {
        println("Given condition is true")
        "Adult"
    } else {
        println("Given condition is false")
        "Minor"
    }
    print("The value of result : ")
    println(result)
}

fun nestedIfElse() {
    val age:Int = 20

    val result = if (age > 12) {
        if ( age > 12 && age  < 20 ){
            "Teen"
        }else{
            "Adult"
        }
    } else {
        "Minor"
    }
    print("The value of result : ")
    println(result)
}

// similar to the switch statement in C, C++ and Java.
fun whenExpression() {
    val day = 2

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    // combining conditions
    when (day) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }

    // ranges in conditions
    when (day) {
        in 1..5 -> println("Weekday")
        else -> println("Weekend")
    }
}

fun expressionInWhen() {
    val x = 20
    val y = 10
    val z = 10

    when (x) {
        (y+z) -> print("y + z = x = $x")
        else -> print("Condition is not satisfied")
    }
}

fun forLoop() {
    for (item in 1..5) {
        println(item)
    }

    for (item in 5 downTo 1 step 2) {
        println(item)
    }

    val fruits = arrayOf("Orange", "Apple", "Mango", "Banana")

    for (item in fruits) {
        println(item)
    }

    for (index in fruits.indices) {
        println(fruits[index])
    }
}

fun whileLoop() {
    var i = 5;
    while (i > 3) {
        println(i)
        i--
    }

    do{
        println(i)
        i--
    }while(i > 0)
}

fun breakAndContinue() {
    var i = 0;
    while (i++ < 100) {
        println(i)
        if( i == 3 ){
            break
        }
    }

    // Kotlin label is the form of identifier followed by the @ sign
    // To make any Kotlin Expression as labeled one, we just need to put a label in front of the expression.
    outerLoop@ for (a in 1..3) {
        innerLoop@ for (j in 1..3) {
            println("i = $a and j = $j")
            if (a == 2){
                break@outerLoop
            }
        }
    }

    i = 0
    while (i++ < 6) {
        if( i == 3 ){
            continue
        }
        println(i)
    }

    outerLoop@ for (b in 1..3) {
        innerLoop@ for (j in 1..3) {
            if (b == 2){
                continue@outerLoop
            }
            println("i = $b and j = $j")
        }
    }


}