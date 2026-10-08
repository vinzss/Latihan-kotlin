fun main() {
    println("========================================")
    println("       APLIKASI PENCARIAN MAHASISWA")
    println("          MENGGUNAKAN startsWith()")
    println("========================================")

    print("Nama Mahasiswa  : ")
    val nama = readLine()?.trim() ?: ""

    print("NIM Mahasiswa   : ")
    val nim = readLine()?.trim() ?: ""

    print("Program Studi   : ")
    val prodi = readLine()?.trim() ?: ""

    println("----------------------------------------")

    print("Masukkan awalan yang dicari : ")
    val awalan = readLine()?.trim() ?: ""

    println("----------------------------------------")

    if (nama.startsWith(awalan, ignoreCase = true)) {
        println("DATA DITEMUKAN!")
        println("Nama Mahasiswa : $nama")
    } else {
        println("DATA TIDAK DITEMUKAN!")
    }

    println("========================================")
}