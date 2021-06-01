package collection

fun main() {
    // membuat map
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    // cetak value
    println(capital["Jakarta"])

    // cetak value dengan getValue()
    println(capital.getValue("Jakarta"))

    // mendapatkan keys
    val mapKeys = capital.keys

    // mendapatkan value
    val mapValues = capital.values

    // mutable map
    val mutableMap = capital.toMutableMap()
    mutableMap.put("Amsterdam", "Netherlands") // menambahahkan item dengan key Amsterdam dan value Netherlands
    mutableMap.put("Berlin", "Germany") // menambahkan item dengan key Berlin dan value Germany
}