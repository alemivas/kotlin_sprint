package org.example.lesson_11

fun main() {
    println("=== Классы для приложения рецептов ===")
}

class Category(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val recipes: List<Recipe>,
) {}

class Recipe(
    val id: Int,
    val name: String,
    val image: String,
    var inFavorites: Boolean = false,
    val ingredients: List<Ingredient>,
    val cookingMethod: String,
) {
    fun addToFavorites() {
        inFavorites = true
        println("Рецепт $name добавлен в избранное")
    }

    fun removeFromFavorites() {
        inFavorites = false
        println("Рецепт $name удалён из избранного")
    }

    fun getIngredients(servings: Int) =
        ingredients.forEach { ingredient ->
            "${ingredient.name}\t${ingredient.amount * servings} ${ingredient.units}\n"
        }
}

class Ingredient(
    val id: Int,
    val name: String,
    val amount: Int,
    val units: String,
) {}