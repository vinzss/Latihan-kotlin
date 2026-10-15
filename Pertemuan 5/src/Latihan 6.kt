fun main() {
    println("==============================================")
    println("          APLIKASI NILAI MAHASISWA            ")
    println("==============================================")

    val jumlahMahasiswa = 10
    var totalNilai = 0
    var jumlahLulus = 0
    var jumlahTidakLulus = 0

    // Perulangan untuk memasukkan nilai 10 mahasiswa
    for (i in 1..jumlahMahasiswa) {
        print("Masukkan Nilai Mahasiswa ke-$i (0-100)    : ")
        val nilai = readLine()?.toIntOrNull()

        // Validasi nilai
        if (nilai == null || nilai !in 0..100) {
            println("Nilai tidak valid! Program dihentikan.")
            return
        }

        // Menghitung total nilai
        totalNilai += nilai

        // Menentukan kelulusan
        if (nilai >= 60) {
            jumlahLulus++
        } else {
            jumlahTidakLulus++
        }
    }

    // Menghitung rata-rata
    val rataRata = totalNilai.toDouble() / jumlahMahasiswa

    // Menampilkan hasil
    println()
    println("==============================================")
    println("                HASIL PENILAIAN               ")
    println("==============================================")
    println("Jumlah mahasiswa            : $jumlahMahasiswa")
    println("Total nilai                 : $totalNilai")
    println("Rata-rata nilai             : $rataRata")
    println("Jumlah mahasiswa lulus      : $jumlahLulus")
    println("Jumlah tidak lulus          : $jumlahTidakLulus")
    println("==============================================")
}