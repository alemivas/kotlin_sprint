package org.example.lesson_5

fun main() {

    val rangeForRandom = MINIMUM_HIDDEN_NUMBER..MAXIMUM_HIDDEN_NUMBER
    val hiddenNumber1 = rangeForRandom.random()
    val hiddenNumber2 = rangeForRandom.random()

    println("Угадайте 2 числа от $MINIMUM_HIDDEN_NUMBER до $MAXIMUM_HIDDEN_NUMBER")

    println("Введите первое число")
    val numberToGuess1 = readln().toInt()

    println("Введите второе число")
    val numberToGuess2 = readln().toInt()

    var guessNumbersAmount = 0
    if (numberToGuess1 == hiddenNumber1 || numberToGuess1 == hiddenNumber2)
        guessNumbersAmount++
    if (numberToGuess2 == hiddenNumber1 || numberToGuess2 == hiddenNumber2)
        guessNumbersAmount++

    val winningMessage = when (guessNumbersAmount) {
        2 -> "Поздравляем! Вы выиграли главный приз!"
        1 -> "Вы выиграли утешительный приз!"
        else -> "Неудача"
    }
    println(winningMessage)

    println("Загаданные числа были: $hiddenNumber1 и $hiddenNumber2")

}

const val MINIMUM_HIDDEN_NUMBER = 0
const val MAXIMUM_HIDDEN_NUMBER = 42