package org.example.lesson_9

fun main() {
    println("=== Добавить ингредиент в список ===")
    println()
    val ingredientList = mutableListOf("мука", "соль", "яйца")
    println("В рецепте есть базовые ингредиенты:")
    println(ingredientList.joinToString())
    println()
    println("Желаете добавить еще?")
    val answerToAdding = readln()

    if (!answerToAdding.equals("да", true))
        return
    println("Какой ингредиент вы хотите добавить?")
    val addedIngredient = readln()
    ingredientList.add(addedIngredient)
    println()
    println("Теперь в рецепте есть следующие ингредиенты:")
    println(ingredientList.joinToString())
}