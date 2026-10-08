import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== Aplikasi Hitung Bangun Datar ===")
    println("--- Luas dan Keliling Lingkaran ---")
    print("Masukkan panjang jari-jari (r) dalam cm: ")
    val r : Int = scanner.nextInt()
    val PI: Double = 3.14
    val luas = PI * r * r
    val keliling = 2 * PI * r

    println("-----------------------------------")
    println("Jari-jari yang dimasukkan   : $r cm")
    println("Luas Lingkaran adalah       : $luas cm²")
    println("Keliling Lingkaran adalah   : $keliling cm²")
}