package org.example.lesson_7

fun main() {

    var evenNumbers = ""
    println("Введите число")
    val maxNumber = readln().toInt()

    println("Все четные числа от 0 до $maxNumber:")
    for (i in 0..maxNumber step 2) {
        evenNumbers += "$i, "
    }
    println(evenNumbers.dropLast(2))
}