package fundamental

fun main() {
    // String merupakan tipe data yang menyimpan sebuah teks ("")
    val text = "Kotlin"
    val firstChar = text[0]

    // cetak index 0 dari text
    println("First character of $text is $firstChar") // $ menggunakan string interpolation

    // looping string
    for (char in text){
        print("$char ")
    }

    // escaped string
    val statement = "Kotlin is \"Awesome\""
    println(statement)

    // menambahkan unicode
    val name = "Unicode test : \u00A9"
    println(name)

    // raw string
    val line ="""
        Line 1
        Line 2
        Line 3
    """.trimIndent()
    println(line)
}