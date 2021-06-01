package fundamental

fun main() {
    // panggil fungsi setUser
    var fiki = setUser("Fiki alamsyah", 19)
    print(fiki)

    // panggil fungsi printUser
    printUser("Fiki")
}
// membuat fungsi setUser dengan return value
fun setUser(name: String, age: Int): String = "Your name is $name, and you age is $age"

// membuat fungsi printUser tanpa nilai kembalian
fun printUser(name: String){
    print("Your name is $name")
}
