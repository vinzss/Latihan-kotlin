fun main() {
    println("========================================")
    println("             DATA MAHASISWA")
    println("========================================")

    print("Nama mahasiswa : ")
    val nama = readLine()?.trim() ?: ""

    print("NIM            : ")
    val nim = readLine()?.trim() ?: ""

    print("Program studi  : ")
    val prodi = readLine()?.trim() ?: ""

    println("----------------------------------------")
    println("Nama          : $nama")
    println("NIM           : $nim")
    println("Program Studi : $prodi")
    println("----------------------------------------")

    print("Kata yang dicari: ")
    val kata = readLine()?.trim() ?: ""

    if (nama.contains(kata, ignoreCase = true)) {
        println("Hasil: Kata \"$kata\" ditemukan!")
    } else {
        println("Hasil: Kata \"$kata\" tidak ditemukan!")
    }

    println("========================================")
}