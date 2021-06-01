package fundamental

fun main() {
    // menggunakan ?
    val text: String? = null

    // menggunakan elvis operator ?:
    val textLength = text?.length ?: 7 // mengembalikan 7 apabila text bernilai null

}