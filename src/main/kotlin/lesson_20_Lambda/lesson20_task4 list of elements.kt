package org.example.lesson_20_Lambda

fun main() {
    println("=== Список элементов ===")
    println()
    val categories = listOf("Фрукты", "Молочные", "Хлебные", "Овощи", "Мясные", "Кондитерские")
    categories
        .filterIndexed { index, _ -> index % 2 == 0 }
        .map { println("Нажат элемент $it") }
}
