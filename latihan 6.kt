fun main() {
    println("==================================")
    println("       APLIKASI CEK EMAIL        ")
    println("       MENGGUNAKAN endsWith()    ")
    println("==================================")

    // Input email
    print("Masukkan alamat email : ")
    val email = readLine()?.trim() ?: ""

    println("----------------------------------")

    // Mengecek domain email
    if (email.endsWith("@gmail.com", ignoreCase = true)) {
        println("Email menggunakan Gmail")
    } else if (email.endsWith("@yahoo.com", ignoreCase = true)) {
        println("Email menggunakan Yahoo")
    } else if (email.endsWith("@outlook.com", ignoreCase = true)) {
        println("Email menggunakan Outlook")
    } else {
        println("Domain email tidak dikenali")
    }

    println("Email : $email")
    println("==================================")
}