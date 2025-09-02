package org.example.lesson_5

fun main() {

    val hiddenNumber1 = 25
    val hiddenNumber2 = 17

    println("Угадайте 2 числа от 0 до 42")

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