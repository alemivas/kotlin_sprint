package org.example.lesson_16

fun main() {
    println("=== Класс пользователя и проверка пароля ===")

    val user = User(login = "Mike", password = "123")
    println()
    println("Введите пароль")
    val validPasswordMessage = if (user.isValidPassword(enteredPassword = readln())) "" else " НЕ"
    println("Пароль введен$validPasswordMessage верно")
}

class User(
    private val login: String,
    private val password: String,
) {
    fun isValidPassword(enteredPassword: String) = enteredPassword == password
}