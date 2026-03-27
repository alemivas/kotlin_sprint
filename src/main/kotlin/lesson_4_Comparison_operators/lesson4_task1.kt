package org.example.lesson_4

fun main() {

    val allTableNumbers = 13
    val todayBookedTableNumbers = 13
    val tomorrowBookedTableNumbers = 9

    val todayTableAvailable = todayBookedTableNumbers < allTableNumbers
    val tomorrowTableAvailable = tomorrowBookedTableNumbers < allTableNumbers

    println("Доступность столиков на сегодня: $todayTableAvailable\n" +
            "Доступность столиков на завтра: $tomorrowTableAvailable")

}