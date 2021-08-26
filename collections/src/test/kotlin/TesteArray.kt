fun main() {
    val x = doubleArrayOf(1000.0,2500.0,3800.0)

    println(x.find { it > 2000.0 })
    println(x.any{it > 5000.00})

    println(x.maxOrNull())
    println(x.minOrNull())

    val pair = Pair("Joao", 1000.0)
    val map = mapOf(pair)

    println(map["Joao"])

}
