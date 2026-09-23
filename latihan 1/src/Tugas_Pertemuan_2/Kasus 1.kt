package Tugas_Pertemuan_2

fun main(){
    var nama_mahasiswa : String = "Calvin Juniando"
    var umur : Int = 18
    var tinggi_badan : Int = 177
    var grade = "A"
    var keterangan : Boolean = true

    val Tamplate = """
       ------------------------------------------------
       Nama Mahasiswa           :${nama_mahasiswa}
       Umura Mahasiswa          :${umur} Tahun
       Tinggi Badan mahasiswa   :${tinggi_badan} CM
       Grade                    :${grade} 
       Keterangan               :${keterangan}
    """.trimIndent()
    println(Tamplate)
}
