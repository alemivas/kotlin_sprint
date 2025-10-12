package org.example.lesson_10

fun main() {
    println("=== Игральные кости ===")
    var wonRoundsAmount = 0

    do {
        if (playRound() == USER_WON) wonRoundsAmount++
        println("Хотите бросить кости еще раз? Введите $YES_USER_ANSWER или $NO_USER_ANSWER")
    } while (readln().equals(YES_USER_ANSWER, ignoreCase = true))

    println()
    println("Количество побед пользователя: $wonRoundsAmount")
}

fun playRound(): String {
    println()
    val userDiceNumber = rollGameDice()
    println("Ход игрока: выпало $userDiceNumber")
    val aiDiceNumber = rollGameDice()
    println("Ход компьютера: выпало $aiDiceNumber")
    println()

    return when {
        userDiceNumber > aiDiceNumber -> USER_WON
        userDiceNumber < aiDiceNumber -> AI_WON
        else -> FRIENDSHIP_WON
    }
}

fun rollGameDice() =            //переименовал функцию для исключения конфликта
    (MINIMAL_DICE_NUMBER..MAXIMAL_DICE_NUMBER).random()

const val MINIMAL_DICE_NUMBER = 1
const val MAXIMAL_DICE_NUMBER = 6
const val USER_WON = "Победил пользователь"
const val AI_WON = "Победила машина"
const val FRIENDSHIP_WON = "Победила дружба"
const val YES_USER_ANSWER = "Да"
const val NO_USER_ANSWER = "Нет"