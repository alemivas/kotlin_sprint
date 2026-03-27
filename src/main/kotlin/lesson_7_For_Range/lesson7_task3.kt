package org.example.lesson_7

fun main() {
    println("Введите число")
    val maxNumber = readln().toInt()

    println("Все четные числа от 0 до $maxNumber:")
    for (i in 0..maxNumber step 2) {
        print("$i, ")
    }
    print("\b\b")   //удаление последних лишних символов
}