fun main(){
    println("Masukan Nilai Final = ")
    val nilai = readln().toInt()
    if(nilai >= 85) {
        println("Selamat Anda Lulus Dengan Predikat A")
    }else {
        println("Anda Lulus tapi bukan dengan predikat A")
    }
}