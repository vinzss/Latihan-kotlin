fun main() {
    var x = 10
    var aktif = true

    // 1. Unary Plus & Unary Minus
    println(-x)          // Output: -10 (membalikkan tanda angka)

    // 2. Logical NOT
    println(!aktif)      // Output: false (membalik nilai true menjadi false)

    // 3. Increment & Decrement (Prefix vs Postfix)

    // Postfix (Aksi dulu, baru nilai variabel berubah)
    println(x++)         // Output: 10 (dicetak dulu, baru nilai x naik jadi 11)

    // Prefix (Nilai variabel berubah dulu, baru aksi dilakukan)
    println(++x)         // Output: 12 (nilai x yang tadi 11 naik dulu menjadi 12, lalu dicetak)
}