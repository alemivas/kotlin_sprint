package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val travelTimeInMinutes = 457

    val departureTimeInMinutes =
        (departureHours * MINUTES_IN_HOUR + departureMinutes)
    val arrivalTimeInMinutes = (departureTimeInMinutes + travelTimeInMinutes)

    // время прибытия с учетом смены суток
    val arrivalHours = arrivalTimeInMinutes / MINUTES_IN_HOUR % HOURS_IN_DAY
    val arrivalMinutes = arrivalTimeInMinutes % MINUTES_IN_HOUR

    println("Время прибытия поезда: %02d:%02d".format(arrivalHours, arrivalMinutes))
}