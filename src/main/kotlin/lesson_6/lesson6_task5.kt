package org.example.lesson_6

fun main() {

    println("Регистрация")

    println("Придумайте логин")
    val login = readln()
    println("Придумайте пароль")
    val password = readln()

    println("\nАвторизация")

    var attemptsAmount = 3
    val randomNumbersRange = MIN_TERM..MAX_TERM

    do {
        val firstTerm = randomNumbersRange.random()
        val secondTerm = randomNumbersRange.random()

        println("Ваш логин?")
        val enteredLogin = readln()
        println("Ваш пароль?")
        val enteredPassword = readln()
        println("Сумма чисел $firstTerm + $secondTerm ?")
        val enteredSum = readln().toInt()

        attemptsAmount--


        when {
            enteredSum != firstTerm + secondTerm ->
                println("Сумма не верна")

            enteredLogin == login && enteredPassword == password -> {
                println("Добро пожаловать!")
                return
            }

            else ->
                println("Пароль или логин не верны")
        }

    } while (attemptsAmount > 0)

    println("Доступ запрещен")

}

const val MIN_TERM = 1
const val MAX_TERM = 9