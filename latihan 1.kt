fun main() {
    // 1. Konversi dari String ke Int dan Double
    val stringAngka = "100"
    val ubahKeInt: Int = stringAngka.toInt()
    val ubahKeDouble: Double = stringAngka.toDouble()

    println("Hasil Integer: $ubahKeInt")
    println("Hasil Double: $ubahKeDouble")

    // 2. Konversi dari Int ke String
    val angka = 505
    val ubahKeString: String = angka.toString()

    println("Hasil String: $ubahKeString")

    // 3. Konversi Antar Tipe Angka
    val nilaiDouble = 98.76
    val nilaiInt: Int = nilaiDouble.toInt() //

    println("Hasil konversi Double ke Int: $nilaiInt")
}