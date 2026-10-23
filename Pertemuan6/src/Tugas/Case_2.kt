//Calvin Juniando
fun main() {
    println("Aplikasi Menghitung Luas Persegi Panjang")
    println("Menggunakan Function Parameter")
    println("----------------------------------------")

    print("Masukkan Nilai Panjang\t= ")
    val panjang = readLine()?.toDoubleOrNull()
    print("Masukkan Nilai Lebar\t= ")
    val lebar = readLine()?.toDoubleOrNull()

    if (panjang == null || lebar == null || panjang <= 0 || lebar <= 0) {
        println("Validasi: Nilai input harus berupa angka dan lebih besar dari 0!")
        return
    }
    hitungLuas(panjang, lebar)
}

fun hitungLuas(panjang: Double, lebar: Double) {
    val luas = panjang * lebar
    println("Luas Persegi Panjang\t= $luas cm2")
}