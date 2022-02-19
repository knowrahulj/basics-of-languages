fun main() {
//    println("Program arguments: ${args.joinToString()}")
    dataTypes()
    arithmeticOperators()
    relationalOperators()
    assignmentOperators()
    unaryOperators()
    logicalOperators()
    bitwiseOperators()
    booleanOperators()
    stringTemplates()
    arrays()
    ranges()
    sumTwo(1,2)
    sumTwoUnit(1,2)
    println(factorial(5))
    println(tailRecursionFactorial(10))
    println(higherOrderFunction())
    println(higherOrderFunction1())
    inlineFunction()
    lambdaFunction()
}

fun dataTypes() {
    // Data types
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println()
    println("Int Value is $a")
    println("Double  Value is $d")
    println("Float Value is $f")
    println("Long Value is $l")
    println("Short Value is $s")
    println("Byte Value is $b")

    // Char
    val letter: Char = 'A'
    println("Char value is $letter")
    println()

    // Boolean
    val A: Boolean = true   // defining a variable with true value
    val B: Boolean = false   // defining a variable with false value
    println("Value of variable A $A")
    println("Value of variable B $B")
    println()

    // Data Type Conversion
    /*
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()
     */
    val x: Int = 100
    val y: Long = x.toLong()  // Not valid assignment
    println(y)
    println()
}

fun arithmeticOperators() {
    val x: Int = 40
    val y: Int = 20

    println("x + y = " +  (x + y))
    println("x - y = " +  (x - y))
    println("x / y = " +  (x / y))
    println("x * y = " +  (x * y))
    println("x % y = " +  (x % y))
    println()
}

fun  relationalOperators() {
    val x: Int = 40
    val y: Int = 20

    println("x > y = " +  (x > y))
    println("x < y = " +  (x < y))
    println("x >= y = " +  (x >= y))
    println("x <= y = " +  (x <= y))
    println("x == y = " +  (x == y))
    println("x != y = " +  (x != y))
    println()
}

fun assignmentOperators() {
    var x: Int = 40

    x += 5
    println("x += 5 = $x")

    x = 40;
    x -= 5
    println("x -= 5 = $x")

    x = 40
    x *= 5
    println("x *= 5 = $x")

    x = 40
    x /= 5
    println("x /= 5 = $x")

    x = 43
    x %= 5
    println("x %= 5 = $x")
    println()
}

fun unaryOperators() {
    var x: Int = 40
    var b:Boolean = true

    println("+x = " +  (+x))
    println("-x = " +  (-x))
    println("++x = " +  (++x))
    println("--x = " +  (--x))
    println("!b = " +  (!b))
    println()
}

fun logicalOperators() {
    var x: Boolean = true
    var y:Boolean = false

    println("x && y = " +  (x && y))
    println("x || y = " +  (x || y))
    println("!y = " +  (!y))
    println()
}

fun bitwiseOperators() {
    val x:Int = 60	  // 60 = 0011 1100
    val y:Int = 13	  // 13 = 0000 1101
    var z:Int

    z = x.shl(2)       // 240 = 1111 0000
    println("x.shl(2) = $z")

    z = x.shr(2)       // 15 = 0000 1111
    println("x.shr(2) = $z")

    z = x.and(y)       // 12 = 0000 1100
    println("x.and(y)  = $z")

    z = x.or(y)        // 61 = 0011 1101
    println("x.or(y)  = $z")

    z = x.xor(y)       // 49 = 0011 0001
    println("x.xor(y)  = $z")

    z = x.inv()        // -61 = 1100 0011
    println("x.inv()  = $z")
    println()
}

fun booleanOperators() {
    val x: Boolean = true
    val y: Boolean = false
    val z: Boolean = true

    println("x.and(y) = " +  x.and(y))
    println("x.or(y) = " +  x.or(y))
    println("x.and(z) = " +  x.and(z))
    println()
}

fun stringTemplates() {
    val escapedString : String  = "I am escaped String!\n"
    val rawString :String  = """This is going to be a
                               multi-line string and will
                               not have any escape sequence""";
    print(escapedString)
    println(rawString)
    println()

    val name : String = "Zara Ali"
    println("Name  - $name")  // Using template with variable name
    println("Name length - ${name.length}")  // Using template with expression.
    println()

    println("Upper case of name :" + name.toUpperCase())
    println("Lower case of name :" + name.toLowerCase())

    val firstName : String = "Zara "
    val lastName : String = "Ali"
    println("Full Name :" + firstName + lastName)
    println("Full Name :" + firstName.plus(lastName) )

    println(name[3])
    println(name[5])
    println("The length of name :" + name.length)
    println("The length of name :" + name.count())
    println("The index of last character in name :" + name.lastIndex)

    // trim Characters
    println("Remove first two characters from name : " + name.drop(2))
    println("Remove last two characters from name : " + name.dropLast(2))

    // Quotes inside string
    val str1 : String = "That's it"
    val str2 : String = "It's OK"

    println("str1 : $str1")
    println("str2 : $str2")

    // String inside a String
    val str : String = "Meditation and Yoga are synonymous with India"
    println("Index of Yoga in the string - " + str.indexOf("Yoga"))

    // Comparing Two Strings
    println(str1.compareTo(str2))

    // returns a character at the given index or null if the index is out of bounds of this char sequence.
    println(name.getOrNull(0))
    println(name.getOrNull(2))
    println(name.getOrNull(100))
    println()
}

fun arrays() {
    val fruits = arrayOf("Apple", "Mango", "Banana", "Orange")
    val fruits1 = arrayOf<String>("Apple", "Mango", "Banana", "Orange")
    println( fruits [0])
    println( fruits1 [3])
    println( fruits.get(0))
    println( fruits.get(3))

    fruits.set(3, "Guava")
    println( fruits.get(3))

    println( "Size of fruits array " + fruits.size )

    // loop
    for( item in fruits ){
        println( item )
    }

    // check if element exists
    if ("Mango" in fruits){
        println( "Mango exists in fruits" )
    } else {
        println( "Mango does not exist in fruits" )
    }

    // Distinct Values from Array
    val distinct = fruits.distinct()
    for( item in distinct ){
        println( item )
    }

    // Dropping Elements from Array
    // drop() or dropLast() member functions to drop elements from the beginning or from the last respectively.
    val result = fruits.drop(2) // drops first two elements.
    for( item in result ){
        println( item )
    }

    // Checking an Empty Array
    println( "Array is empty : " + fruits.isEmpty())

    // arrayOfNulls() function can be used to create an array of a given size filled with null elements
    val num = intArrayOf(1, 2, 3, 4)
    byteArrayOf()
    charArrayOf()
    shortArrayOf()
    longArrayOf()

    println()
}

fun ranges() {
    for ( num in 1.rangeTo(4) ) {
        println(num)
    }

    for ( num in 1..4 ) {
        println(num)
    }

    for ( num in 4 downTo 1 ) {
        println(num)
    }

    for ( num in 1 until 5 ) {
        println(num)
    }

    for ( num in 1..10 step 2 ) {
        println(num)
    }

    for ( ch in 'a'..'d' ) {
        println(ch)
    }

    for ( num in (1..5).reversed() ) {
        println(num)
    }

    println((5..10).first)
    println((5..10 step 2).step)
    println((5..10).reversed().last)

    val a = 1..10
    val f = a.filter { T -> T % 2 == 0 }
    println(f)

    val b = listOf(1, 1, 2, 4, 4, 6, 10)
    println(b.distinct())

    println(a.minOrNull())
    println(a.maxOrNull())
    println(a.sum())
    println(a.average())
    println(a.count())
    println()
}

fun sumTwo(a:Int, b:Int):Int{
    val x = a + b
    return x
}

// If a function does not return a useful value, its return type is Unit. Unit is a type with only one value which is Unit.
fun sumTwoUnit(a:Int, b:Int):Unit{
    val x = a + b
    println(x)
}

// Recursion
fun factorial(a:Int):Int{
    val result:Int = if( a <= 1){
        a
    } else {
        a*factorial(a-1)
    }
    return result
}

// A recursive function is eligible for tail recursion if the function call to itself is the last operation it performs.
// Kotlin tail recursion is useful while calculating factorial or some other processing on large numbers.
// So to avoid java.lang.StackOverflowError, you must use tail recursion.
fun tailRecursionFactorial(a: Int, ac: Int = 1): Int {
    val result = a * ac
    return if (a <= 1) {
        result
    } else {
        tailRecursionFactorial(a - 1, result)
    }
}


// Higher order functions
// A higher-order function is a function that takes another function as parameter and/or returns a function.
// the function argument ::sum. Here :: is the notation that references a function by name in Kotlin.
fun higherOrderFunction() {
    calculate(1, 2, ::add)
}
fun add(a: Int, b: Int) = a + b
fun calculate(a: Int, b: Int, operation:(Int, Int) -> Int): Int {
    return operation(a, b)
}

fun higherOrderFunction1() {
    val func = operation()
    println( func(4) )
}
fun square(x: Int) = x * x
fun operation(): (Int) -> Int {
    return ::square
}

// Kotlin lambda is a function which has no name and defined with a curly braces {} which takes zero or more parameters and body of function.
// The body of function is written after variable (if any) followed by -> operator.
fun lambdaFunction() {
    val upperCase = { str: String -> str.toUpperCase() }
    println( upperCase("hello, world!") )
}

// inline function tells the compiler to copy parameters and functions to the call site.
// use of inline function enhances the performance of higher order function.
fun inlineFunction() {
    myFunction({println("Inline function parameter")})
}

inline fun myFunction(function:()-> Unit){
    println("I am inline function - A")
    function()
    println("I am inline function - B")
}