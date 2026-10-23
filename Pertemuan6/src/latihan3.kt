import kotlin.math.PI
//Calvin Juniando
fun hitungLuasLingkaran(jariJari: Double): Double {
    return PI * jariJari * jariJari
}

fun main() {
    println("==========================================")
    println("          APLIKASI LUAS LINGKARAN         ")
    println("==========================================")

    print("Masukkan Jari-Jari Lingkaran      : ")
    val jariJari = readLine()?.toDoubleOrNull()

    if (jariJari == null || jariJari < 0) {
        println("Input tidak valid! Masukkan angka >= 0.")
        return
    }
    val luas = hitungLuasLingkaran(jariJari)

    println("------------------------------------------")
    println("Jari-jari lingkaran     : $jariJari")
    println("Luas lingkaran          : %.2f".format(luas))
    println("==========================================")
}