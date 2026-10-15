fun main() {
    println("=======================================")
    println("           Aplikasi Kalkulator         ")
    println("=======================================")

    print("Masukan angka pertama : ")
    val angka1 = readlnOrNull()?.toDoubleOrNull()

    print("Masukan angka Kedua   : ")
    val angka2 = readlnOrNull()?.toDoubleOrNull()

    println("----------------------------------------")
    print("Masukan Operasi (+, -, *, /) : ")
    val ops = readlnOrNull()

    if (angka1 == null || angka2 == null) {
        println("Error: Angka input tidak boleh kosong atau harus berupa angka valid!")
        return
    }

    when (ops) {
        "+" -> println("Hasil dari operasi hitung : ${angka1 + angka2}")
        "-" -> println("Hasil dari operasi hitung : ${angka1 - angka2}")
        "*" -> println("Hasil dari operasi hitung : ${angka1 * angka2}")
        "/" -> {
            if (angka2 == 0.0) {
                println("Error: Pembagian dengan nol tidak diperbolehkan!")
            } else {
                println("Hasil dari operasi hitung : ${angka1 / angka2}")
            }
        }
        else -> println("Error: Operator tidak valid!")
    }
}