package org.example.lesson_11

fun main() {
    println("=== Класс пользователя ===")
    val user1 = User(1, "Bob", "123", "bob@gmail.com")
    val user2 = User(2, "Lisa", "555", "lisa@gmail.com")

    println()
    println("Данные первого пользователя:")
    println("идентификатор: ${user1.id}")
    println("логин: ${user1.login}")
    println("пароль: ${user1.password}")
    println("почта: ${user1.email}")
    println()
    println("Данные второго пользователя:")
    println("идентификатор: ${user2.id}")
    println("логин: ${user2.login}")
    println("пароль: ${user2.password}")
    println("почта: ${user2.email}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {}