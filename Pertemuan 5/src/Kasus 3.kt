fun main(){
    println("=======================================")
    println("         Aplikasi Katagori Umur        ")
    println("=======================================")
    print("Masukan umur Anda    : ")
    var umur : Int = readLine()!!.toInt()
    println("---------------------------------------")
    println( "Umur anda         : ${umur}")
    var katagori : String = ""
    when{
    umur <= 0 -> katagori = "Umur tidak Valid"
    umur in 0..11 -> katagori = "Anak-Anak"
    umur in 12..17 -> katagori = "Remaja"
    umur in 18..59 -> katagori = "Dewasa"
    umur >= 60 -> katagori = "Lansia"}
    println("Kategori usia     : ${katagori}")
}