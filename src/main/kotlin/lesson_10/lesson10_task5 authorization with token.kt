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
    if (token != null) {
        println("Содержимое корзины:")
        println(getCart(token = token).joinToString())
    } else {
        println("Авторизация не прошла")
        println("Содержимое корзины не доступно")
    }
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
        token.toString()
    } else
        null
}

fun getCart(token: String) = listOf(
    "яблоки 1 кг",
    "бананы 2 кг",
    "груши 1,5 кг",
    "апельсины 0,5 кг",
)

const val USER_NAME = "Александр"
const val USER_PASSWORD = "123123"
const val TOKEN_LENGTH = 32