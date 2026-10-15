fun main() {
    println("=========================================")
    println("      APLIKASI NILAI MAHASISWA")
    println("=========================================")

    var total = 0
    var jumlahMahasiswa = 5

    for (i in 1..jumlahMahasiswa) {
        print("Masukkan Nilai Mahasiswa ke-$i      : ")
        val nilai = readLine()?.toIntOrNull()

        if (nilai == null || nilai !in 0..100) {
            println("Nilai tidak valid! Masukkan nilai 0 - 100")
            return
        }
        total += nilai
    }

    val rataRata = total.toDouble() / jumlahMahasiswa

    println("-----------------------------------------")
    println("Jumlah Mahasiswa      : $jumlahMahasiswa")
    println("Total nilai           : $total")
    println("Rata-Rata Nilai       : $rataRata")
    println("=========================================")
}