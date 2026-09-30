fun main() {
    val angka1 = 15
    val angka2 = 4

    val hasilTambah = angka1 + angka2
    val hasilKurang = angka1 - angka2
    val hasilKali = angka1 * angka2
    val hasilBagi = angka1.toDouble() / angka2
    val hasilSisa = angka1 % angka2

    println("--- Operator Aritmatika ---")
    println("$angka1 + $angka2 = $hasilTambah")
    println("$angka1 - $angka2 = $hasilKurang")
    println("$angka1 * $angka2 = $hasilKali")
    println("$angka1 / $angka2 = $hasilBagi")
    println("$angka1 % $angka2 = $hasilSisa")
}