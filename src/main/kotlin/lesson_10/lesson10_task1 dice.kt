package org.example.lesson_10

fun main() {
    println("=== Игральные кости ===")
    println()
    val userDiceNumber = rollDice()
    println("Ход игрока: выпало $userDiceNumber")
    val aiDiceNumber = rollDice()
    println("Ход компьютера: выпало $aiDiceNumber")

    when {
        userDiceNumber > aiDiceNumber ->
            println("Победило человечество")
        userDiceNumber < aiDiceNumber ->
            println("Победила машина")
        else ->
            println("Победила дружба")
    }
}

fun rollDice(): Int =
    (MIN_DICE_NUMBER..MAX_DICE_NUMBER).random()

const val MIN_DICE_NUMBER = 1
const val MAX_DICE_NUMBER = 6