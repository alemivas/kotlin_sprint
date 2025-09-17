package org.example.lesson_6

fun main() {

    val hiddenNumber = (MIN_NUMBER..MAX_NUMBER).random()

    var attemptsAmount = 5

    println("Угадайте число в промежутке от $MIN_NUMBER до $MAX_NUMBER за $attemptsAmount попыток\n")

    do {
        println("Введите число")
        val guessNumber = readln().toInt()

        attemptsAmount--

        when {
            guessNumber == hiddenNumber -> {
                println("Это была великолепная игра!")
                return
            }

            attemptsAmount > 0 ->
                println("Неверно. Осталось $attemptsAmount попыток")

            else ->
                println("Неверно. Было загадано число $hiddenNumber")
        }

    } while (attemptsAmount > 0)

}

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9