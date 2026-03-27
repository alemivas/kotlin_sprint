package org.example.lesson_5

fun main() {

    val randomRange = 1..9
    val number1 = randomRange.random()
    val number2 = randomRange.random()

    println(
        "Если ты человек, то напиши результат\n$number1 + $number2 = ?"
    )

    val enteredResult = readln().toInt()

    if (enteredResult == number1 + number2)
        println("Добро пожаловать, человек!")
    else
        println("Доступ запрещен")

}