package org.example.lesson_1

fun main() {

    val fullSeconds: Short = 6480

    // остаток секунд без целых часов
    val secondsWoHours: Short = (fullSeconds % 3600).toShort()

    var hours: String = (fullSeconds/3600).toString()

    var seconds: String = (secondsWoHours % 60).toString()

    var minutes: String = (secondsWoHours/60).toString()

    if (hours.length == 1)
        hours = "0$hours"
    if (minutes.length == 1)
        minutes = "0$minutes"
    if (seconds.length == 1)
        seconds = "0$seconds"

    println("$hours:$minutes:$seconds")

}