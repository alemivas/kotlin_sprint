package org.example.lesson_10

fun main() {
    println("=== Авторизация с токеном в интернет-магазине ===")
    println()
    println("Введите имя:")
    val userName = readln()
    println("Введите пароль:")
    val userPassword = readln()

    val token = authorize(userName = userName, userPassword = userPassword)

    println()
    println(getCart(token = token))
}

fun authorize(userName: String, userPassword: String): String? {
    return if (userName == USER_NAME && userPassword == USER_PASSWORD) {
        val digitRange = '0'..'9'
        val lowercaseLetterRange = 'a'..'z'
        val uppercaseLetterRange = 'A'..'Z'
        val fullSymbolsList = digitRange + lowercaseLetterRange + uppercaseLetterRange
        val token = StringBuilder()

        for (i in 1..TOKEN_LENGTH) {
            token.append(fullSymbolsList.random())
        }
//        println(token)
        token.toString()
    } else
        null
}

fun getCart(token: String?): String {
    val userCart = mapOf(
        "яблоки" to "1 кг",
        "бананы" to "2 кг",
        "груши" to "1,5 кг",
        "апельсины" to "0,5 кг",
    )
    return if (token != null)
        "Содержимое корзины:\n$userCart"
    else
        "Авторизация не прошла.\nСодержимое корзины не доступно"
}

const val USER_NAME = "Александр"
const val USER_PASSWORD = "123123"
const val TOKEN_LENGTH = 32