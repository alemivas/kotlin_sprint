package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTES_IN_HOUR

fun main() {

    val fullSeconds: Short = 6480

    // остаток секунд без целых часов
    val secondsWoHours: Short = (fullSeconds % SECONDS_IN_HOUR).toShort()

    val hours: Byte = (fullSeconds / SECONDS_IN_HOUR).toByte()

    val seconds: Byte = (secondsWoHours % SECONDS_IN_MINUTE).toByte()

    val minutes: Byte = (secondsWoHours / SECONDS_IN_MINUTE).toByte()

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}