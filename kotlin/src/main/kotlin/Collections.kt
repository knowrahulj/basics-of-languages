fun main() {
    immutableCollection()
    mutableCollection()
    list() // same in set
    map()
}

fun immutableCollection() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers)
//    numbers.add

    val setOfNumbers = setOf("one", "two", "three", "four")
    println(setOfNumbers)

}

fun mutableCollection() {
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.add("five")
    println(numbers)

    numbers.remove("Four")

//    ArrayList<T>()
//    arrayListOf()
//    mutableListOf()

//    HashMap
//    hashMapOf()
//    mutableMapOf()

//    hashSetOf()
//    mutableSetOf()
}

fun list() {
    val theList = listOf("one", "two", "three", "four")
    println(theList)

    val theMutableList = mutableListOf("one", "two", "three", "four")
    println(theMutableList)

    val arrayList = ArrayList<String>()
    arrayList.add("One")

    val theArrayList = arrayListOf("one", "two", "three", "four")
    println(theMutableList)

    val itr = theList.listIterator()
    while (itr.hasNext()) {
        println(itr.next())
    }

    // foreach
    theList.forEach { println(it) }

    println("Size of the list " + theList.size)

    // in
    if("two" in theList){
        println(true)
    }else{
        println(false)
    }

    // contain
    if(theList.contains("two")){
        println(true)
    }else{
        println(false)
    }

    // isEmpty
    if(theList.isEmpty()){
        println(true)
    } else {
        println(false)
    }

    // indexOf
    println("Index of 'two' :  " + theList.indexOf("two"))

    // get
    println("Element at 3rd position " + theList.get(2))

    // adding lists
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("four", "five", "six")
    var resultList = firstList + secondList
    println(resultList)

    // subtracting lists
    resultList = firstList - secondList
    println(resultList)

    // Slicing a List
    resultList = theList.slice( 2..4)
    println(resultList)

    // Removing null from a List
    resultList = theList.filterNotNull()
    println(resultList)

    // filtering
    val intList = listOf(10, 20, 30, 31, 40, 50, -1, 0)
    var resultIntList = intList.filter{ it > 30}
    println(resultIntList)

    // Dropping First N Elements
    resultList = theList.drop(3)
    println(resultList)

    // Grouping List Elements
    val resultMap = intList.groupBy{ it % 3}
    println(resultMap) // {1=[10, 31, 40], 0=[12, 30, 9, -3, 0]}


    // Mapping list elements
    resultIntList = intList.map{ it / 3 }
    println(resultIntList)  // [3, 4, 10, 10, 13, 3, -1, 0]

    // Chunking List Elements
    var resultIntListOfList = intList.chunked(3)
    println(resultIntListOfList)  // [[10, 12, 30], [31, 40, 9], [-3, 0]]

    // Windowing List Elements
    resultIntListOfList = intList.windowed(3)
    println(resultIntListOfList)    // [[10, 12, 30], [12, 30, 31], [30, 31, 40], [31, 40, 9], [40, 9, -3], [9, -3, 0]]
}

fun map() {
    var theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMap) // {one=1, two=2, three=3, four=4}

    val theMutableMap = mutableSetOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMutableMap)  // [(one, 1), (two, 2), (three, 3), (four, 4)]

    theMap = HashMap<String, Int>()
    theMap["one"] = 1
    theMap["two"] = 2
    theMap["three"] = 3
    theMap["four"] = 4
    println(theMap) // {four=4, one=1, two=2, three=3}

    theMap = mapOf(Pair("one", 1), Pair("two", 2), Pair("three", 3))
    println(theMap)

    println("Entries: " + theMap.entries)
    println("Keys:" + theMap.keys)
    println("Values:" + theMap.values)

    // loop
    val itr = theMap.keys.iterator()
    while (itr.hasNext()) {
        val key = itr.next()
        val value = theMap[key]
        println("${key}=$value")
    }

    for ((k, v) in theMap) {
        println("$k = $v")
    }

    theMap.forEach {
            (k, v) -> println("Key = $k, Value = $v")
    }

    if(theMap.containsKey("two")){
        println(true)
    }else{
        println(false)
    }

    if(theMap.containsValue(2)){
        println(true)
    }else{
        println(false)
    }

    if(theMap.isEmpty()){
        println(true)
    }else{
        println(false)
    }

    println("The value for key two " + theMap.get("two"))
    println("The value for key two " + theMap["two"])

    val firstMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val secondMap = mapOf("one" to 10, "four" to 4)
    var resultMap = firstMap + secondMap
    println(resultMap)  // {one=10, two=2, three=3, four=4}

    val theKeyList = listOf("one", "four")
    resultMap = theMap - theKeyList
    println(resultMap) // {two=2, three=3}

    // Removing Entries from Map
    theMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    theMap.remove( "two")
    println(theMap)

    // Sorting Map Elements
    theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    resultMap = theMap.toSortedMap()
    println(resultMap) // {four=4, one=1, three=3, two=2}

    // Filtering Map Elements
    theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    resultMap = theMap.filterValues{ it > 2}
    println(resultMap)

    resultMap = theMap.filterKeys{ it == "two"}
    println(resultMap)

    resultMap = theMap.filter{ it.key == "two" || it.value == 4}
    println(resultMap)

    // Mapping Map Elements
    theMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val resultMap1 = theMap.map{ (k, v) -> "Key is $k, Value is $v" }
    println(resultMap1)
}
