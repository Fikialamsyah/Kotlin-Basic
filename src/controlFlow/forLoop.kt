fun main() {
    // cara 1
    // val ranges = 1..5
    // cara 2 dengan rangeTo()
    // val ranges = 1.rangeTo(5)
    // cara 3 dengan step
    val ranges = 1.rangeTo(10) step 3

    // loopin ranges
    for(i in ranges){
        println("Value is $i")
    }

    // looping dengan index dan value
    for((index, value) in ranges.withIndex()){
        println("value $value with index $index")
    }

    // looping dengan for each
    ranges.forEach { value->
        println("value is $value")
    }

    // looping for each dengan index dan value
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    // looping for each dengan index saja
    ranges.forEachIndexed{ index, _ ->
        println("index $index")
    }

    // forloop dengan continue
    val listOfInt = listOf(1, 2, 3, null, 7)
    for (i in  listOfInt){
        if (i == null) continue // lanjut ke value iterasi berikutnya
        println(i)
    }

    // forloop dengan break
    for(i in listOfInt){
        if (i == null) break
        println(i)
    }

    // break & continue dengan labels
    loop@ for (i in 1..10){
        println("Outside Loop")

        for (j in 1..10){
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}