import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    print("Masukan Nama anda            : ")
    var name = input.nextLine()
    print("Masukan nominal belanja anda : ")
    var tot_bel = input.nextInt()
    println("pelangan dengan nama           : $name")
    println("dengan total belanja sebesar   : Rp $tot_bel")
    println("Apakah Anda berhak mendapatkan diskon? ${tot_bel >= 100000} ")
    println("Apakah $name Berbelanja? ${tot_bel > 0}")
}