package objectsAndClasses

fun main(args: Array<String>) {
    try {
        val myVar:Int = 12;
        val v:String = "Rahul";
        v.toInt();
    } catch(e:Exception) {
        e.printStackTrace();
    } finally {
        println("Exception Handling in Kotlin");
    }
}