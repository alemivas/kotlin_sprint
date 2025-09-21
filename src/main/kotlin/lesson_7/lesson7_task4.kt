package org.example.lesson_7

fun main() {
    println("Сколько секунд нужно засечь таймером?")
    val seconds = readln().toInt()

    println("До конца осталось:")
    for (i in seconds downTo 1) {
        println("$i секунд")
        Thread.sleep(ONE_SECOND_IN_MILLIS)
    }
    println("Время вышло")
}

const val ONE_SECOND_IN_MILLIS = 1000L