package collection

fun main() {
    // membuat set
    val integerSet = setOf(1, 2, 3, 2, 3)
    val setA = setOf(1, 1, 2, 3)
    val setB = setOf(1, 2, 2, 3, 3)

    // melakukan perbandingan
    println(setA == setB)

    // menggunakan in
    println(5 in setA)

    // union
    val union = setA.union(setB)

    // intersect
    val intersect = setA.intersect(setB)

    // mutable set
    val mutableSet = mutableSetOf(1, 2, 2, 3 ,5)
    // mutableSet[2] = 1 tidak bisa mengubah  set immutable
    mutableSet.add(6) // menambahkan item di akhir set
    mutableSet.remove(1) // menghapus item yang memiliki nilai 1




}