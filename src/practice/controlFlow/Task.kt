package practice.controlFlow

//TODO 1 :
//Perbaiki ekspresi pada kode jika nilai number bernilai genap maka proses iterasi akan dilewatkan.
//
//TODO 2 :
//Perbaiki ekspresi pada kode jika nilai number bernilai lebih dari 15 maka proses iterasi akan dihentikan.
//
//TODO 3 :
//Lengkapi inisialisasi variable result dengan rumus perhitungan berikut:
//number x ( number + 10

fun main() {
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        // TODO 1
        if (number % 2 == 0) continue

        // TODO 2
        if (number > 15) break

        // TODO 3
        val result = number * (number + 10)
        println("range result is $result")
    }
}