package org.example.lesson_2

import kotlin.math.pow

const val DIV_FOR_PERCENT = 100

fun main() {

    val depositAmount = 70_000
    val interestRateInPercent = 16.7
    val depositPeriod = 20

    val interestRateInFloat = interestRateInPercent / DIV_FOR_PERCENT
    val multiplier = (1 + interestRateInFloat).pow(depositPeriod)
    val accumulatedCapital = depositAmount * multiplier

    println("%.3f".format(accumulatedCapital))

}