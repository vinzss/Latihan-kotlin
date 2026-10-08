fun main() {
    println("==================================")
    println("       APLIKASI DATA MAHASISWA")
    println("==================================")

    // INPUT
    print("Masukkan nama lengkap : ")
    val nama = readLine()?.trim() ?: ""

    print("Masukkan NIM          : ")
    val nim = readLine()?.trim() ?: ""

    print("Masukkan program studi: ")
    val prodi = readLine()?.trim() ?: ""

    // MANIPULASI STRING
    val namaKapital = nama.uppercase()
    val namaKecil = nama.lowercase()
    val jumlahKarakter = nama.length

    // Mengambil kata pertama dari nama
    val namaDepan = nama.split(" ")[0]

    // OUTPUT
    println()
    println("==================================")
    println("       HASIL DATA MAHASISWA")
    println("==================================")

    println("Nama asli       : $nama")
    println("Nama kapital    : $namaKapital")
    println("Nama kecil      : $namaKecil")
    println("Nama depan      : $namaDepan")
    println("NIM             : $nim")
    println("Program Studi   : $prodi")
    println("Jumlah karakter : $jumlahKarakter")

    println("==================================")
}