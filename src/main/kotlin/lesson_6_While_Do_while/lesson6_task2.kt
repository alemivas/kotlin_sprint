package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    val seconds = readln().toInt()

    Thread.sleep(seconds * SECOND_IN_MILLISECONDS)

    println("Прошло $seconds секунд")

}

const val SECOND_IN_MILLISECONDS = 1000L