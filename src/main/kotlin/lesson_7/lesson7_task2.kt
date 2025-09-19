package org.example.lesson_7

fun main() {

    do {

        val authorizationCode = (MIN_CODE..MAX_CODE).random().toString()

        println("\nВаш код авторизации: $authorizationCode")

        println("Введите код авторизации")
        val inputCode = readln()

        val isCodeCorrect = inputCode == authorizationCode
        if (!isCodeCorrect)
            println("Код не верный")

    }while (!isCodeCorrect)

    println("Добро пожаловать!")

}

const val MIN_CODE = 1000
const val MAX_CODE = 9999