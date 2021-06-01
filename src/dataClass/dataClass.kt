package dataClass

import javax.xml.crypto.Data

data class DataUser(val name: String, val age: Int)
class User(val name:String, val age: Int) {

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val user = User("Fiki", 20)
    val user2 = User("Fiki", 20)
    val dataUser = DataUser("Fiki" ,20)
    val dataUser2 = DataUser("Fiki", 20)
    // mengcopy data class
    val dataUser4 = dataUser.copy()

    // destructing declarations with componentN()
    // val name = dataUser.component1()
    // val age = dataUser2.component2()

    // destructing declarations
    val (name, age) = dataUser

    // perlu membuat method toString() pada class biasa
    println(user)

    // otomatis mengenerate fungsi toString() pada data class
    println(dataUser)

    // perlu membuat fungsi equals() pada class biasa
    println(user.equals(user2))

    // terdapat bawaan fungsi equals() pada data class
    println(dataUser.equals(dataUser2))

    // cetak data yang telah di destructuring
    println("My Name is $name, and I am age is $age years old")


}