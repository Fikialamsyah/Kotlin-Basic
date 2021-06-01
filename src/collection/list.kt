package collection

fun main() {
    // membuat list
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    // mutable list
    val anyList = mutableListOf('a', "Kotlin", true)

    // manipulasi mutable list
    anyList.add('d') // menambahkan item pada akhir list
    anyList.add(1, "love") // menambah item pada indeks ke 1
    anyList[3] = false // mengubah nilai item pada indeks ke 3
    anyList.removeAt(1) // menghapus nilai item pada indeks ke 1
}