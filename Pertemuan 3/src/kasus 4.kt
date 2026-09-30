import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    println("=== Program Pengecekan Syarat Diskon Belanja ===")

    print("Apakah Anda punya kartu member? (true/false): ")
    val isMember = input.nextBoolean()

    print("Apakah total belanjaan di atas Rp 100.000? (true/false): ")
    val totalBelanja = input.nextBoolean()

    val diskonSpesial = isMember && totalBelanja
    val gratisOngkir = isMember || totalBelanja
    val bukanMember = !isMember

    println()
    println("===      Hasil Analisis Logika      ===")
    println("Pelanggan dapat diskon spesial : $diskonSpesial")
    println("Pelanggan dapat gratis ongkir  : $gratisOngkir")
    println("Status bukan member            : $bukanMember")
}