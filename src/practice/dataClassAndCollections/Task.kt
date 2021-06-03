package practice.dataClassAndCollections

//TODO 1 :
//Lengkapi dengan kode untuk inisialisasi objek vehicle dengan ketentuan key dan value sebagai berikut:
//type = Motorcycle
//maxSpeed = 230Km/s
//maxTank = 10Ltr
//TODO 2 :
//Lengkapi inisialisasi kode untuk mendapatkan nilai dari objek vehicle.
//TODO 3 :
//Tambahkan fungsi untuk mencetak teks berikut pada konsol:
//Vehicle
//Type: Motorcycle
//Maximal Speed: 230Km/s
//Maximal Tank: 10Ltr

fun main() {

    // TODO 1
    val vehicle = mutableMapOf<String, String>()
    vehicle.put("Type", "Motorcycle")
    vehicle.put("maxSpeed", "230Km/s")
    vehicle.put("maxTank", "10Ltr")

    // TODO 2
    val type = vehicle.get("Type")
    val maxSpeed = vehicle.get("maxSpeed")
    val maxTank = vehicle.get("maxTank")

    // TODO 3
    println("""
        Vehicle
        Type : $type
        Maximal Speed : $maxSpeed
        Maximal Tank : $maxTank
    """.trimIndent())

}