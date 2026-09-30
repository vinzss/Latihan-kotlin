import java.util.Scanner
//calvin
fun main(){
    val input = Scanner(System.`in`)
    println("===== Operasi Persegi Panjang =====")
    print("Masukan panjang : ")
    var panjang = input.nextInt()
    print("Masukan Lebar   : ")
    var lebar = input.nextInt()
    var luas = panjang * lebar
    println("Luas dari persegi panjang = $luas CM")


}