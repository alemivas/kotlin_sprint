package org.example.lesson_16

fun main() {
    println("=== Игральный кубик ===")

    val dice = Dice()
    dice.printDiceNumber()
}

class Dice(
    private val diceNumber: Int = (MINIMAL_DICE_NUM..MAXIMAL_DICE_NUM).random()
) {
    fun printDiceNumber() {
        println()
        println("На кубике выпало число $diceNumber")
    }
}

const val MINIMAL_DICE_NUM = 1
const val MAXIMAL_DICE_NUM = 6