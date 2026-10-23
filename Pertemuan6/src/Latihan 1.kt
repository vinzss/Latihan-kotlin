//Calvin Juniando
fun penjumlahan() {
    println("=== Program Penjumlahan ===")

    print("Masukkan Angka Pertama  = ")
    val angka1 = readLine()?.toIntOrNull()

    print("Masukkan Angka Kedua    = ")
    val angka2 = readLine()?.toIntOrNull()

    if (angka1 == null || angka2 == null) {
        println("Input tidak valid! Masukkan bilangan bulat.")
        return
    }

    val hasil = angka1 + angka2

    println("Hasil penjumlahan       = $hasil")
}

fun main() {
    penjumlahan()
}