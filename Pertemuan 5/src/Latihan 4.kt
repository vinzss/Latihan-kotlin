fun main(){
    var nilai : Int = 65
    var grade : String = ""
    when (nilai) {
        in 90 .. 100 -> grade = "A+"
        in 80..89 -> grade = "A"
        in 70..79 -> grade = "B+"
        in 60..69 -> grade = "B"
        in 50..59 -> grade = "C+"
        in 50..60 -> grade = "C"
        in 60..70 -> grade = "D"
        in 70..79 -> grade = "E"
        else -> grade = "F"
    }
    println("Selamat anda mendapatkan nilai : $grade")
}
