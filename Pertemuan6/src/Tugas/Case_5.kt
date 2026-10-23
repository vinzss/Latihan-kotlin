package Tugas
//Calvin juniando
fun main() {
    println("=================================")
    println("APLIKASI PENILAIAN KARYAWAN")
    println("=================================")

    print("Masukkan NIP Karyawan\t\t: ")
    val nip = readLine()
    print("Masukkan Nama Karyawan\t\t: ")
    val nama = readLine()
    print("Masukkan Nilai Kinerja (0-100)\t: ")
    val nilai = readLine()?.toIntOrNull()

    if (nip.isNullOrBlank() || nama.isNullOrBlank() || nilai == null) {
        println("NIP, Nama, dan Kinerja harus diisi dengan benar!")
        return
    }

    cetakHasil(nama, nilai)
}

fun getKategori(skor: Int): String {
    return when (skor) {
        in 90..100 -> "Sangat Baik"
        in 80..89 -> "Baik"
        in 70..79 -> "Cukup"
        in 60..69 -> "Kurang"
        in 0..59 -> "Sangat Kurang"
        else -> "Tidak Valid"
    }
}

fun getRekomendasi(skor: Int): String {
    return when (skor) {
        in 90..100 -> "Pertahankan kinerja dan pertimbangkan penghargaan"
        in 80..89 -> "Pertahankan kualitas kerja dan tingkatkan kemampuan."
        in 70..79 -> "Tingkatkan produktivitas dan keterampilan."
        in 60..69 -> "Perlu pembinaan dan pemantauan berkala."
        in 0..59 -> "Perlu evaluasi menyeluruh dan pendampingan."
        else -> "-"
    }
}

fun cetakHasil(nama: String, skor: Int) {
    println("=================================")
    println("HASIL PENILAIAN KINERJA")
    println("=================================")
    println("Nama Karyawan\t: $nama")
    println("Nilai Kinerja\t: $skor")
    println("Kategori\t: ${getKategori(skor)}")
    println("Rekomendasi\t: ${getRekomendasi(skor)}")
    println("=================================")
}