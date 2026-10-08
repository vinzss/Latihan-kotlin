fun main() {
    println("======================================")
    println("        APLIKASI DATA MAHASISWA")
    println("          MANIPULASI STRING")
    println("======================================")

    print("Nama mahasiswa : ")
    val nama = readLine()?.trim() ?: ""

    print("Program studi  : ")
    val prodiAwal = readLine()?.trim() ?: ""

    println("--------------------------------------")

    print("Kata yang diganti : ")
    val kataLama = readLine()?.trim() ?: ""

    print("Kata pengganti    : ")
    val kataBaru = readLine()?.trim() ?: ""

    println("--------------------------------------")

    val prodiBaru = prodiAwal.replace(kataLama, kataBaru)

    println("Nama mahasiswa     : $nama")
    println("Program studi awal : $prodiAwal")
    println("Program studi baru : $prodiBaru")

    println("======================================")
}