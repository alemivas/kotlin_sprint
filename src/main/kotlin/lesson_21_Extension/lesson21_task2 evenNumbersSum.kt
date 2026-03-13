package org.example.lesson_21_Extension

fun main() {
    println("=== Сумма четных чисел списка ===")
    println()
    val intList = listOf(1, 2, 3, 4, 5, 6)
    println(intList.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() =
    filter { it % 2 == 0 }.sum()
