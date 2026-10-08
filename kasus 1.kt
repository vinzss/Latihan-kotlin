import sun.security.krb5.Confounder.bytes
import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    println("=====================================")
    println("        Konversi Data Digital        ")
    println("=====================================")
    print("Masukan Jumlah Byte: ")
    var byte : Int = input.nextInt()
    var bytedouble: Double = byte.toDouble()
    var hasil : Double = bytedouble/1024
    println("")
    println("-------------------------------------")
    println("Jumlah Byte: ${bytedouble} Byte")
    println("Hasil Byte : ${hasil} KB")
    println("------------------------------")

}