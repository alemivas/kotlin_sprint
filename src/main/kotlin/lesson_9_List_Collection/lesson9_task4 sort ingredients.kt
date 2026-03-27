package org.example.lesson_9

fun main() {
    println("=== Сортировка ингредиентов ===")
    println()
    println("Введите пять названий ингредиентов блюда в одной строке, разделяя их запятыми с пробелом")
    val ingredientsString = readln()

    val ingredientsList = ingredientsString.split(", ")
    val sortedIngredientsList = ingredientsList.sorted()

    println()
    println("Отсортированный по алфавиту список ингредиентов:")
    println(sortedIngredientsList.joinToString())
}