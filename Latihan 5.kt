fun main() {
    println("==================================")
    println("       APLIKASI DATA MAHASISWA   ")
    println("          MENGGUNAKAN split()    ")
    println("==================================")

    // Input nama lengkap
    print("Nama lengkap mahasiswa : ")
    val nama = readLine()?.trim() ?: ""

    println("----------------------------------")

    // Memecah nama berdasarkan spasi
    val bagianNama = nama.split(" ")

    // Menampilkan hasil
    println("Nama lengkap : $nama")
    println("Jumlah kata  : ${bagianNama.size}")

    println("----------------------------------")

    println("Bagian nama:")

    for (i in bagianNama.indices) {
        println("Kata ke-${i + 1} : ${bagianNama[i]}")
    }

    println("==================================")
}