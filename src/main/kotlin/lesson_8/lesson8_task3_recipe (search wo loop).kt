package org.example.lesson_8

fun main() {
    println("=== Проверка наличия ингредиента в рецепте ===")
    val ingredientsArray = arrayOf("яйца", "масло", "соль", "зелень", "перец")
    println("\nКакой ингредиент хотите найти?")
    val searchedIngredient = readln()

    if (searchedIngredient in ingredientsArray)
        println("Ингредиент $searchedIngredient в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")
}