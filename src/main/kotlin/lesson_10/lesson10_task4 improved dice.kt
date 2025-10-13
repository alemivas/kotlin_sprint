package org.example.lesson_10

fun main() {
    println("=== Игральные кости ===")
    var wonRoundsAmount = 0

    do {
        if (playRound()) wonRoundsAmount++
        println("Хотите бросить кости еще раз? Введите $YES_USER_ANSWER или $NO_USER_ANSWER")
    } while (readln().equals(YES_USER_ANSWER, ignoreCase = true))

    println()
    println("Количество побед пользователя: $wonRoundsAmount")
}

fun playRound(): Boolean {
    println()
    val userDiceNumber = rollGameDice()
    println("Ход игрока: выпало $userDiceNumber")
    val aiDiceNumber = rollGameDice()
    println("Ход компьютера: выпало $aiDiceNumber")

    return when {
        userDiceNumber > aiDiceNumber -> {
            println("Победил пользователь")
            println()
            true
        }

        userDiceNumber < aiDiceNumber -> {
            println("Победила машина")
            println()
            false
        }

        else -> {
            println("Победила дружба")
            println()
            false
        }
    }
}

fun rollGameDice() = (MINIMAL_DICE_NUMBER..MAXIMAL_DICE_NUMBER).random()

const val MINIMAL_DICE_NUMBER = 1
const val MAXIMAL_DICE_NUMBER = 6

const val YES_USER_ANSWER = "Да"
const val NO_USER_ANSWER = "Нет"