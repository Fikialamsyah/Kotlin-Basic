package fundamental

fun main() {
    // array dynamic
    val mixArray = arrayOf(1, 2, 3, null, true, "dicoding")

    // array int (explisit array)
    val intArray = intArrayOf(1, 2, 3, 4, 5)

    // akses array pada index ke 2
    println(intArray[2])

    // membuat array dengan Class Array
    val myArray = Array(4,{ i -> i * i })
    myArray.forEach {
        println("$it")
    }
}