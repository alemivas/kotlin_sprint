package org.example.lesson_8

fun main() {
    println("=== Замена ингредиента в рецепте ===")
    val ingredientsArray = arrayOf("яйца", "масло", "соль", "зелень", "перец")
    println("\nИнгредиенты: ")
    for (ingredient in ingredientsArray) {
        print("$ingredient, ")
    }
    print("\b\b")

    println("\nКакой ингредиент хотите заменить?")
    val removedIngredient = readln()
    val indexOfRemovedIngredient = ingredientsArray.indexOf(removedIngredient)
    if (indexOfRemovedIngredient != -1) {
        println("Какой ингредиент хотели бы добавить?")
        val addedIngredient = readln()
        ingredientsArray[indexOfRemovedIngredient] = addedIngredient
        println("\nГотово! Вы сохранили следующий список: ")
        for (ingredient in ingredientsArray) {
            print("$ingredient, ")
        }
        print("\b\b")
    } else
        println("Такого ингредиента в рецепте нет")
}