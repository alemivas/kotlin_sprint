package org.example.lesson_6

fun main() {

    println("Регистрация")

    println("Придумайте логин")
    val login = readln()
    println("Придумайте пароль")
    val password = readln()

    var isLoginAndPasswordCorrect = false

    do {
        println("Ваш логин?")
        val enteredLogin = readln()
        println("Ваш пароль?")
        val enteredPassword = readln()

        if (enteredLogin == login && enteredPassword == password)
            isLoginAndPasswordCorrect = true
        else
            println("Пароль или логин не верны")

    } while (!isLoginAndPasswordCorrect)

    println("Авторизация прошла успешно")

}