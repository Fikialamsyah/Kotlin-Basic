package practice.kotlinFundamental

//TODO:
//Lengkapi inisialisasi variable result dengan melakukan operasi matematika pada argumen yang diberikan dengan rumus perhitungan berikut:
//valueA + (valueB - valueC)
//Jika valueC bernilai null berikan 50 untuk nilai defaultnya.
//
//Jika program dijalankan, maka pada konsol akan menampilkan text:
//ResultA is 54
//ResultB is 103


fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
    // TODO
    return valueA + (valueB - (valueC ?: 50))
}