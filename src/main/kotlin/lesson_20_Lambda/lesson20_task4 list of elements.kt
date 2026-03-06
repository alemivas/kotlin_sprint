package org.example.lesson_20_Lambda

fun main() {
    println("=== Список элементов ===")
    println()
    val categoriesList = listOf("Фрукты", "Молочные", "Хлебные", "Овощи", "Мясные", "Кондитерские")
    val categoriesLambdaList: List<() -> Unit> = categoriesList.map { category ->
        { println("Нажат элемент $category") }
    }
    categoriesLambdaList.forEachIndexed { index, lambda ->
        if (index % 2 == 0) lambda()
    }
}
