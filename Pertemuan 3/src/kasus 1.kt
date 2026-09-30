import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Masukan Angka pertama :")
    val x = input.nextInt()
    print("Masukan Angka Kedua :")
    val y = input.nextInt()

    println("Kotlin Arithmetic Operator By Calvin")
    println("--------------------------------")

    println("Nilai $x + $y = ${x + y}")
    println("Nilai $x - $y = ${x - y}")
    println("Nilai $x * $y = ${x * y}")
    println("Nilai $x / $y = ${x / y}")
    println("Nilai $x % $y = ${x % y}")
}