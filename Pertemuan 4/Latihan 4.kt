fun main() {
    println("==================================")
    println("       APLIKASI PENGUBAH TEKS")
    println("==================================")

    // Input kalimat
    print("Masukkan kalimat : ")
    val kalimat = readLine()?.trim() ?: ""

    // Input kata yang ingin diganti
    print("Kata yang diganti: ")
    val kataLama = readLine()?.trim() ?: ""

    // Input kata pengganti
    print("Kata pengganti   : ")
    val kataBaru = readLine()?.trim() ?: ""

    println("----------------------------------")

    // Mengganti kata
    val hasil = kalimat.replace(kataLama, kataBaru)

    println("Kalimat awal : $kalimat")
    println("Kalimat baru : $hasil")

    println("==================================")
}