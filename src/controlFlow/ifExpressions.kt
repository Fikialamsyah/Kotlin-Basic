package controlFlow

fun main() {
    // if dan else statement
    val openOffice = 7
    val now = 8
    val openHours = 7
    if (now > openOffice)
        print("Office already open") // jika true
    else
        print("Office close")

    // if , else if, else statement
    if (now > 7) {
        "Office already open" // jika now > 7 = true
    } else if (now == openHours){
        "Wait a minute, office will be open" // jika now == openHours = true
    } else {
        "Office is closed"
    }

    // membungkus if statement dengan sebuah variabel
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)


}