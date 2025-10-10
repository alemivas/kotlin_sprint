package org.example.lesson_10

fun main() {
    println("=== Регистрация ===")
    println()
    println("Придумайте логин")
    val login = readln()
    println("Придумайте пароль")
    val password = readln()

    if (isValidString(login) && isValidString(password))
        println("Добро пожаловать, $login!")
    else
        println("Логин или пароль недостаточно длинные")
}

fun isValidString(string: String) =
    string.length >= MIN_LOGIN_AND_PASSWORD_LENGTH

const val MIN_LOGIN_AND_PASSWORD_LENGTH = 4