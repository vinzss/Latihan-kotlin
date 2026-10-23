//Calvin Juniando

fun hitungTotalBelanja(
    harga: Double,
    jumlah: Int,
    diskon: Double = 0.0

): Double {
    val subtotal = harga * jumlah
    val potongan = subtotal * diskon / 100
    return subtotal - potongan
}

fun main() {
    println("========================================")
    println("          APLIKASI TOTAL BELANJA        ")
    println("========================================")

    print("Masukkan Harga Barang    = Rp ")
    val harga = readLine()?.toDoubleOrNull()

    print("Masukkan Jumlah Barang   = ")
    val jumlah = readLine()?.toIntOrNull()

    if (harga == null || harga <= 0 ||
        jumlah == null || jumlah <= 0
    ) {
        println("Input tidak valid!")
        return
    }

    println("\nPilih jenis pembelian:")
    println("1. Tanpa diskon")
    println("2. Dengan diskon 10%")
    print("Pilihan Anda: ")

    val pilihan = readLine()?.toIntOrNull()

    val total = when (pilihan) {
        1 -> hitungTotalBelanja(harga, jumlah)
        2 -> hitungTotalBelanja(harga, jumlah, diskon = 10.0)
        else -> {
            println("Pilihan tidak valid!")
            return
        }
    }

    println("----------------------------------------")
    println("Harga Barang     : Rp${"%.2f".format(harga)}")
    println("Jumlah           : $jumlah")
    println("Total bayar      : Rp${"%.2f".format(total)}")
    println("========================================")
}