package Tugas_Pertemuan_2

fun main(){
    println("Masukan Nama Anda...")
    var nama = readLine()
    println("Masukan Usia Anda...")
    var umur = readLine()
    var umurbaru = Integer.valueOf(umur) + 2
    var umurbaru2 = umur!!.toInt() + 2

    println("Namaku $nama saat ini umur ku $umur tahun")
    println("2 tahun lagi umur ku berusia $umurbaru tahun")
    println("2 tahun lagi umur ku berusia $umurbaru2 tahun")

}