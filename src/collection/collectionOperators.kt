package collection

fun main() {
    // filter()
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val eventList = numberList.filter { it % 2 == 0 }
    println(eventList)

    // filterNot()
    val notEventList = numberList.filterNot { it % 2 == 0 }
    println(notEventList)

    // map()
    val multipliedBye5 = numberList.map { it * 5 }
    println(multipliedBye5)

    // count()
    println(numberList.count())

    // find()
    val firstOddNumber = numberList.find { it % 2 == 1 }
    println(firstOddNumber)

    // firstOrNull
    val firstOrNull = numberList.firstOrNull { it % 2 == 3 }
    println(firstOrNull)

    // first()
    val moreThan10 = numberList.first() { it > 10}
    println(moreThan10)

    // sum()
    val total = numberList.sum()
    println(total)

    // sorted()
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // sortedDescending()
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)



}