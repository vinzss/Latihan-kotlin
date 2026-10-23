package Tugas
//Calvin juniando
fun main() {
    println("================================")
    println("APLIKASI DISKON BELANJA")
    println("================================")

    print("Masukkan Nama Pelanggan\t\t: ")
    val nama = readLine()
    print("Kategori Pelanggan [Umum/Member]: ")
    val kategori = readLine()
    print("Masukkan Total Belanja (Rp)\t: ")
    val belanja = readLine()?.toDoubleOrNull()

    if (nama.isNullOrBlank() || kategori.isNullOrBlank() || belanja == null || belanja < 0) {
        println("Input tidak valid!")
        return
    }

    val diskon = hitungDiskon(belanja)
    val totalBayar = hitungTotalBayar(belanja, diskon)

    println("--------------------------------")
    println("Nama Pelanggan\t\t: $nama")
    println("Kategori Pelanggan\t: $kategori")
    println("Total belanja\t\t: Rp.%,.2f".format(belanja))
    println("Diskon\t\t\t: Rp.%,.2f".format(diskon))
    println("Total bayar\t\t: Rp.%,.2f".format(totalBayar))
    println("================================")
}

fun hitungDiskon(total: Double): Double {
    val persen = when {
        total >= 1_000_000 -> 0.15
        total >= 500_000 -> 0.10
        total >= 100_000 -> 0.05
        else -> 0.0
    }
    return total * persen
}

fun hitungTotalBayar(total: Double, diskon: Double): Double {
    return total - diskon
}