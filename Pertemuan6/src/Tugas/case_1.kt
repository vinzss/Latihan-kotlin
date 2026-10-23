package Tugas
//Calvin Juniando
fun main() {
    tentukanKelulusan()
}

fun tentukanKelulusan() {
    println("=====================================")
    println("APLIKASI PENENTUAN KELULUSAN MAHASISWA")
    println("=====================================")
    print("Masukkan Nama Mahasiswa : ")
    val nama = readLine()
    print("Masukkan Nilai Mahasiswa : ")
    val nilaiInput = readLine()?.toIntOrNull()

    if (nama.isNullOrBlank() || nilaiInput == null || nilaiInput !in 0..100) {
        println("Input tidak valid! Pastikan nama terisi dan nilai berada antara 0 - 100.")
        return
    }

    val status = if (nilaiInput >= 65) "LULUS" else "TIDAK LULUS"

    println("-------------------------------------")
    println("Nama Mahasiswa\t: $nama")
    println("Nilai Mahasiswa\t: $nilaiInput")
    println("Status\t\t: $status")
    println("=====================================")
}