package org.example.lesson_9

fun main() {
    println("=== Список ингредиентов ===\n")
    val ingredientList = listOf("мука", "соль", "яйца", "сахар", "вода", "масло")
    println("В рецепте есть следующие ингредиенты:")
    ingredientList.forEach {
        println(it)
    }
}