package org.example.lesson_7

fun main() {

    val authorizationCodeRange = MIN_CODE..MAX_CODE
    var authorizationCode: String
    var inputCode: String
    var isCodeCorrect: Boolean

    do {
        authorizationCode = authorizationCodeRange.random().toString()
        println("\nВаш код авторизации: $authorizationCode")

        println("Введите код авторизации")
        inputCode = readln()

        isCodeCorrect = inputCode == authorizationCode
        if (!isCodeCorrect)
            println("Код не верный")
    } while (!isCodeCorrect)
    println("Добро пожаловать!")
}

const val MIN_CODE = 1000
const val MAX_CODE = 9999