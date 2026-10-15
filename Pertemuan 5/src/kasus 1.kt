fun main(){
    println("Masukan Nama Mahasiswa : ")
    var nama = readLine()?.trim()
    println("Masukan Nilai Final : ")
    var nilai = readLine()?.toIntOrNull()
    var predikat : String

    if(nilai != null){
        if(nilai < 0 || nilai > 100) {
            println("Error : Nilai tidak boleh - dan lebih dari 100")
        }else{
            if(nilai >= 65){
                predikat = "Lulus"
            }else {
                predikat = "Tidak Lulus"
            }
            println("Nama Mahasiswa : ${nama}")
            println("Nilai Final    : ${nilai}")
            println("Status         : ${predikat}")
        }
    } else{
        println("Error : Nilai tidak boleh Kosong" + "")
    }
}