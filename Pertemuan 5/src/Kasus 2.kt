fun main() {
    print("Masukan NIP Karyawan : ")
    val nip = readln().toInt()
    print("Masukan Nama Karyawan : ")
    val nama = readln()
    print("Masukan Skor Kinerja (0-100): ")
    val skor = readln().toInt()

    var predikat = ""
    var keterangan = ""

    if (skor >= 0 && skor <= 100) {
        if (skor >= 90) {
            predikat = "Sangat Baik"
            keterangan = "Pertahankan Kinerja dan Pertimbangkan Penghargaan."
        } else if (skor >= 80) {
            predikat = "Baik"
            keterangan = "Pertahankan Kualitas kerja dan tingkatkan kemampuan."
        } else if (skor >= 70) {
            predikat = "Cukup"
            keterangan = "Tingkatkan Produktivitas dan keterampilan."
        } else if (skor >= 60) {
            predikat = "Kurang"
            keterangan = "Perlu pemantauan dan pembinaan berkala."
        } else {
            predikat = "Sangat Kurang"
            keterangan = "Perlu evaluasi menyeluruh dan pendampingan."
        }

        println("--------------------------------------")
        println("        Hasil Penilaian Kinerja       ")
        println("NIP Karyawan   : $nip")
        println("Nama Karyawan  : $nama")
        println("Skor Kinerja   : $skor")
        println("Predikat       : $predikat")
        println("Keterangan     : $keterangan")
    } else {
        println("Error: Skor harus berada di antara rentang 0 sampai 100.")
    }
}