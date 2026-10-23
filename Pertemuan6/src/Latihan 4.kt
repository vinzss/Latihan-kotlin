//Calvin Juniando
fun jumlahan(a: Double, b: Double): Double {
    return a + b
}

fun kurangan(a: Double, b: Double): Double {
    return a - b
}

fun kalian(a: Double, b: Double): Double {
    return a * b
}

fun bagian(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    val angka1 = 20.0
    val angka2 = 5.0

    println("Penjumlahan   : ${jumlahan(a = angka1, b = angka2)}")
    println("Pengurangan   : ${kurangan(a = angka1, b = angka2)}")
    println("Perkalian     : ${kalian(a = angka1, b = angka2)}")
    println("Pembagian     : ${bagian(a = angka1, b = angka2)}")
}