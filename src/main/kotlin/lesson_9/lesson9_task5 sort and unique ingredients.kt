package org.example.lesson_9

fun main() {
    println("=== Сортировка уникальных ингредиентов ===")
    println()
    val ingredientsSet = mutableSetOf<String>()
    println("Введите $INGREDIENTS_AMOUNT ингредиентов по одному")
    for (i in 1..INGREDIENTS_AMOUNT) {
        ingredientsSet.add(readln())
    }

    val sortAndUniqueIngredientsString = ingredientsSet.sorted().joinToString()
    val uppercaseFirstCharIngredientsString = sortAndUniqueIngredientsString.replaceFirstChar { it.uppercase() }

    println("Отсортированный список ингредиентов без повторов:")
    println(uppercaseFirstCharIngredientsString)
}

const val INGREDIENTS_AMOUNT = 5