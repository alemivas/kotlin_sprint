package org.example.lesson_7

fun main() {

    var password = ""

    for (i in 1..NUMBER_OF_ITERATIONS){

        val randomChar = (MIN_CHAR..MAX_CHAR).random()
        val randomNumber = (MIN_NUMBER..MAX_NUMBER).random()

        password += randomChar.toString() + randomNumber

    }

    println("Сгенерированный пароль: $password")

}

const val MIN_NUMBER = 0
const val MAX_NUMBER = 9

const val MIN_CHAR = 'a'
const val MAX_CHAR = 'z'

const val NUMBER_OF_ITERATIONS = 3