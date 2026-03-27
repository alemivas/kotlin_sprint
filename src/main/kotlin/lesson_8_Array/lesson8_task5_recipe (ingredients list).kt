package org.example.lesson_8

fun main() {
    println("=== Список ингредиентов ===\n")
    println("Введите количество ингредиентов")
    val ingredientAmount = readln().toInt()
    val ingredientArray = Array(ingredientAmount) { "" }
    println("Введите ингредиенты по одному")

    for (i in ingredientArray.indices) {
        ingredientArray[i] = readln()
    }
    println("Ингредиенты:")
    println(ingredientArray.joinToString())
}