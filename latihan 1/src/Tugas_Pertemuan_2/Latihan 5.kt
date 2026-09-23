package Tugas_Pertemuan_2

fun main() {
    var fullname : String = "Calvin Juniando"
    var adress : String  =  """
        Street : Kelapa Gading Timur No.23
        Province,Jakarta
        Country,Indonesia
    """.trimIndent()
    val usia : Int = 13

    val template = """
        Nama Siswa : $fullname
        Usia siswa : $usia Tahun
        Alamat siswa : $adress
        
        $fullname 5 tahun lagi berusia ${usia + 5} Tahun
    """.trimIndent()
    println(template)
}