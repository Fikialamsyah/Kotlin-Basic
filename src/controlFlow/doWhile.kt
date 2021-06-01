package controlFlow

fun main() {
    // cara penggunaan doWhile
    var counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 10)

    var value = 'A'
    do {
        println(value)
        value++
    } while (value <= 'Z')
}