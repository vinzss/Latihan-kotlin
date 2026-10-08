fun main() {
    println("==================================")
    println("       APLIKASI PENCARIAN KATA")
    println("==================================")

    print("Masukkan sebuah kalimat      : ")
    val kalimat = readLine()?.trim() ?: ""

    print("Masukkan kata yang dicari    : ")
    val kata = readLine()?.trim() ?: ""

    println("----------------------------------")

    if (kalimat.contains(kata, ignoreCase = true)) {
        println("Kata \"$kata\" ditemukan!")
    } else {
        println("Kata \"$kata\" tidak ditemukan!")
    }

    println("==================================")
}