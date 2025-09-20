package org.example.lesson_7

fun main() {

    var password = ""
    val charRange = MIN_CHAR..MAX_CHAR
    val numberRange = MIN_NUMBER..MAX_NUMBER
    var randomChar: Char
    var randomNumber: Int

    for (i in 1..NUMBER_OF_ITERATIONS) {
        randomChar = charRange.random()
        randomNumber = numberRange.random()
        password += "$randomChar$randomNumber"
    }
    println("Сгенерированный пароль: $password")
}

const val MIN_NUMBER = 0
const val MAX_NUMBER = 9
const val MIN_CHAR = 'a'
const val MAX_CHAR = 'z'
const val NUMBER_OF_ITERATIONS = 3