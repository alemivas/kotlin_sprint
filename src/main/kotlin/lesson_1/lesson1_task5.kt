package org.example.lesson_1

fun main() {

    val fullSeconds: Short = 6480

    // остаток секунд без целых часов
    val moduloSeconds: Short = (fullSeconds % 3600).toShort()

    val hours: Byte = (fullSeconds/3600).toByte()

    val seconds: Byte = (moduloSeconds % 60).toByte()

    val minutes: Byte = (moduloSeconds/60).toByte()

    println("$hours : $minutes : $seconds")

}