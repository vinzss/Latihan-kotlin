package Tugas_Pertemuan_2

import java.util.Scanner
import java.time.LocalDate
fun main (){
    var Tanggal = LocalDate.now()
    var tahun = Tanggal.year
    val input = Scanner(System.`in`)
    print("Masukankan Nama anda...")
    var nama_mahasiswa : String = input.nextLine()
    print("Masukan Umur Anda...")
    var umur : Int = input.nextInt()
    print("Masukan Tinggi Badan Anda...")
    var Tinggi_badan : Int = input.nextInt()
    print("Masukan Grade anda (A/B/C/D)...")
    var Grade : String = input.next()

    var Tamplate = """
        Selamat Datang, ${nama_mahasiswa}
        dengan umur ${umur} tahun, kelahiran tahun ${tahun - umur}
        Dengan tinggi badan $Tinggi_badan CM, dengan grade $Grade
    """.trimIndent()
    println(Tamplate)
}