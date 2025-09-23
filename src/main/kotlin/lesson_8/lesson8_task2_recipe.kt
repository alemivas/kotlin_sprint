package org.example.lesson_8

fun main() {
    println("=== Проверка наличия ингредиента в рецепте ===")
    val ingredientsArray = arrayOf("яйца", "масло", "соль", "зелень", "перец")
    println("\nКакой ингредиент хотите найти?")
    val searchedIngredient = readln()

    for (ingredient in ingredientsArray) {
        if (ingredient == searchedIngredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}