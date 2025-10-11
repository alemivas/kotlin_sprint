package org.example.lesson_10

fun main() {
    println("=== Генератор паролей ===")
    println()
    println("Введите длину пароля")
    val passwordLength = readln().toInt()
    val password = generatePassword(passwordLength = passwordLength)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(passwordLength: Int): String {
    val digitRange = 0..9
    val symbolRange = "!\"#\$%&'()*+,-./ "
    val password = StringBuilder()

    for (i in 1..passwordLength) {
        when (i % 2 == 1) {
            true -> password.append(digitRange.random())
            false -> password.append(symbolRange.random())
        }
    }
    return password.toString()
}