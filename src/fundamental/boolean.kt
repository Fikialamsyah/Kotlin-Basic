package fundamental

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    // operator AND (&&)
    val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")

    // operator OR (||)
    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")

    // Negasi atau Not (!)
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}