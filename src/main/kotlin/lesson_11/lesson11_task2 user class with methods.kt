package org.example.lesson_11

fun main() {
    println("=== Класс пользователя с методами ===")
    val user1 = User2(
        id = 1,
        login = "Bob",
        password = "123",
        email = "bob@gmail.com"
    )

    user1.setBio()
    user1.changePassword()
    user1.printUserInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUserInfo() {
        println()
        println("Данные пользователя:")
        println("идентификатор: $id")
        println("логин: $login")
        println("пароль: $password")
        println("почта: $email")
        if (bio != "")
            println("о себе: $bio")
    }

    fun setBio() {
        println()
        println("Введите информацию о себе")
        bio = readln()
    }

    fun changePassword() {
        println()
        println("Смена пароля")
        println("Введите текущий пароль")
        if (readln() == password) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль успешно заменен")
        } else
            println("Пароль введен неверно")
    }
}