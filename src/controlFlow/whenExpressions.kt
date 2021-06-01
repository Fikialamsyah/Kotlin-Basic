import kotlin.random.Random

fun main() {

    // penggunaan when umumnya
    val value = 7
    when (value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8"   )
        else -> println("value cannot be reached")
    }

    // dibungkus variable
    val stringValue = when(value){
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("Undefined")
            println("value cannot be reached")
        }
    }

    // memeriksa instance dengan tipe tertentu
    val anyType: Any = 100L
    when(anyType){
        is Long -> println("The value has a Long type")
        is String -> println("The value has a String type")
        else -> println("undefined")
    }

    // memeriksa nilai pada sebuah range atau collection
    val ranges = 1..10
    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    // menangkap subjek dari sebuah variabel
    val registerNumber = when(val regis = Random.nextInt(100)){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println("No Register : $registerNumber")
}