package org.example.lesson_2

const val DIVISOR_FOR_PERCENT = 100

fun main() {

    val buffInPercent = 20
    val numberOfCrystallineOre = 7
    val numberOfIronOre = 11

    val buffInFloat = buffInPercent.toFloat() / DIVISOR_FOR_PERCENT

    val buffOfCrystallineOre = (numberOfCrystallineOre * buffInFloat).toInt()
    val buffOfIronOre = (numberOfIronOre * buffInFloat).toInt()

    println("Бафф для кристаллической руды: $buffOfCrystallineOre")
    println("Бафф для железной руды: $buffOfIronOre")

}
