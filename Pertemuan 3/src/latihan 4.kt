fun main() {
    // 1. Inisialisasi variabel awal (harus menggunakan 'var' agar nilainya bisa diubah)
    var totalSkor = 100
    var jumlahBarang = 5
    var hargaProduk = 25000.0
    var dompetElektronik = 500000.0

    println("=== KONDISI AWAL ===")
    println("Total Skor: $totalSkor")
    println("Jumlah Barang: $jumlahBarang")
    println("Harga Produk: Rp$hargaProduk")
    println("Saldo Dompet: Rp$dompetElektronik")
    println()

    // 2. Menggunakan Augmented Assignments

    // += (Menambah nilai variabel)
    totalSkor += 50 // Sama dengan: totalSkor = totalSkor + 50

    // -= (Mengurangi nilai variabel)
    jumlahBarang -= 2 // Sama dengan: jumlahBarang = jumlahBarang - 2

    // *= (Mengalikan nilai variabel)
    hargaProduk *= 1.1 // Naik harga 10% (Sama dengan: hargaProduk = hargaProduk * 1.1)

    // /= (Membagi nilai variabel)
    dompetElektronik /= 2 // Saldo dibagi dua (Sama dengan: dompetElektronik = dompetElektronik / 2)

    // %= (Sisa hasil bagi / Modulo)
    var sisaPermen = 10
    sisaPermen %= 3 // Dibagikan ke 3 orang, sisa berapa? (Sama dengan: sisaPermen = sisaPermen % 3)

    // 3. Menampilkan Hasil Setelah Diperbarui
    println("===        SETELAH AUGMENTED ASSIGNMENTS        ===")
    println("Total Skor Baru (+50)                  : $totalSkor")
    println("Jumlah Barang Baru (-2)                : $jumlahBarang")
    println("Harga Produk Baru (Diskon/Pajak *1.1)  : Rp$hargaProduk")
    println("Saldo Dompet Baru (/2)                 : Rp$dompetElektronik")
    println("Sisa Permen (10 % 3)                   : $sisaPermen")
}