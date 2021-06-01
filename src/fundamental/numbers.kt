package fundamental

fun main() {
    // cek nilai max Int
    val maxInt = Int.MAX_VALUE
    // cek nilai min Int
    val minInt = Int.MIN_VALUE

    println(maxInt)
    print(minInt)

    // melakukan operasi aritmatika
    val number1 = 10
    val number2 = 2
    println(number1 + number2) // penjumlahan
    println(number1 - number2) // pengurangan
    println(number1 / number2) // pembagian
    println(number1 * number2) // perkalian
    println(number1 % number2) // modulus

    // casting tipe data
    val stringNumber = "23"
    println(stringNumber.toInt())

    // readable number
    val readableNumber = 1_000_000
    println(readableNumber)


}