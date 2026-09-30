fun main() {
    val isMember = true
    val age = 20
    val hasCoupon = false

    // Syarat 1: Member AND Usia minimal 18 tahun
    val qualifiedByMembership = isMember && (age >= 18)

    // Syarat 2: Atau punya kupon diskon
    val getDiscount = qualifiedByMembership || hasCoupon

    // Syarat 3: NOT (tidak boleh) sedang diblokir (dianggap false)
    val isNotBlocked = true
    val finalDecision = getDiscount && !isNotBlocked

    println("Status Member  : $isMember")
    println("Usia           : $age")
    println("Punya Kupon    : $hasCoupon")
    println("Dapat Diskon?  : $finalDecision")
}