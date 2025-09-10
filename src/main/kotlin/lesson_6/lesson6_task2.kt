package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь")
    val enteredSeconds = readln().toInt()

    var remainingSeconds = enteredSeconds

    while (remainingSeconds > 0) {
        println("Осталось $remainingSeconds секунд")
        Thread.sleep(SECOND_IN_MILLISECONDS)
        remainingSeconds--
    }

    println("Прошло $enteredSeconds секунд")

}

const val SECOND_IN_MILLISECONDS = 1000L