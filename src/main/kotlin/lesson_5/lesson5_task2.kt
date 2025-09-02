package org.example.lesson_5

fun main() {

    val currentYear = 2025

    println("Введите год вашего рождения")
    val yearOfBirth = readln().toInt()

    if ((currentYear - yearOfBirth) >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Доступ к скрытому контенту закрыт")

}

const val AGE_OF_MAJORITY = 18