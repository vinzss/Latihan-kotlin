package Tugas
//Calvin Juniando
fun main() {
    println("=================================")
    println("APLIKASI KALKULATOR")
    println("=================================")

    print("Input Nilai Pertama\t= ")
    val n1 = readLine()?.toDoubleOrNull()
    print("Input Nilai Kedua\t= ")
    val n2 = readLine()?.toDoubleOrNull()

    if (n1 == null || n2 == null || n1 <= 0 || n2 <= 0) {
        println("Nilai harus berupa angka dan lebih besar dari Nol!")
        return
    }

    println("\nPilih operator:")
    println("1. Penjumlahan (+)")
    println("2. Pengurangan (-)")
    println("3. Perkalian (*)")
    println("4. Pembagian (/)")
    print("Pilihan Anda\t\t= ")
    val pilihan = readLine()?.toIntOrNull()

    val hasil = when(pilihan) {
        1 -> hitung(n1, n2, "+")
        2 -> hitung(n1, n2, "-")
        3 -> hitung(n1, n2, "*")
        4 -> hitung(n1, n2, "/")
        else -> {
            println("Pilihan tidak valid")
            return
        }
    }

    println("---------------------------------")
    println("Nilai Pertama\t\t= $n1")
    println("Nilai Kedua\t\t= $n2")
    println("Hasil Perhitungan\t= $hasil")
    println("=================================")
}

fun hitung(a: Double, b: Double, operator: String): Double {
    return when(operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> 0.0
    }
}