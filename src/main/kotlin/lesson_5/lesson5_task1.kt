package org.example.lesson_5

fun main() {

    val number1 = 3
    val number2 = 5

    println(
        "Если ты человек, то напиши результат\n$number1 + $number2 = ?"
    )

    val enteredResult = readln().toInt()

    if (enteredResult == (number1 + number2))
        println("Добро пожаловать, человек!")
    else
        println("Доступ запрещен")

}