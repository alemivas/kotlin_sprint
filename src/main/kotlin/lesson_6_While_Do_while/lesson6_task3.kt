package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(ONE_SECOND_IN_MILLISECONDS)
        seconds--
    }

    println("Время вышло")

}

const val ONE_SECOND_IN_MILLISECONDS = 1000L