package controlFlow

fun main() {
    // range dengan ..
    val ranges = 1..10
    println(ranges.step)

    // range dengan rangeTo() dengan step 2
    val rangeInt = 1.rangeTo(10) step 2
    rangeInt.forEach {
        println("$it")
    }

    // range dengan downTo()
    val downInt = 10.downTo(1)
    if (7 in downInt){
        println("value 7 available")
    }

    // range untuk char
    val rangeChar = 'A'.rangeTo('Z')


}