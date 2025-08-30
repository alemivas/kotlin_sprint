package org.example.lesson_2

const val MINUTES_IN_HOUR: Byte = 60

fun main() {


    val departureHours: Byte = 9
    val departureMinutes: Byte = 39
    val travelTimeInMinutes: Short = 457

    val departureTimeInMinutes: Short =
        (departureHours * MINUTES_IN_HOUR + departureMinutes).toShort()
    val arrivalTimeInMinutes: Short = (departureTimeInMinutes + travelTimeInMinutes).toShort()


    //учесть переход суток
}