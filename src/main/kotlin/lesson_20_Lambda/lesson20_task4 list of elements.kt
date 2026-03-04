package org.example.lesson_20_Lambda

fun main() {
    println("=== Список элементов ===")
    println()

    val categories = listOf("Фрукты", "Молочные", "Хлебные", "Овощи", "Мясные", "Кондитерские")

    val lambda: (String) -> Unit = { println("Нажат элемент $it") }

//    val clickAllCategories = categories.map { println("Нажат элемент $it") }
    categories.map(lambda)
//    val clickedCategories = categories.map { println("Нажат элемент $it") }.filterIndexed { index, _ -> index % 2 == 0 }
//    val clickedCategories = categories.filterIndexed { index, _ -> index % 2 == 0 }.map { println("Нажат элемент $it") }
//    val clickedCategories = categories.mapIndexed { index, string ->
//        index % 2 == 0
//        println("Нажат элемент $string")
//    }
//    val clickedCategories = categories.filterIndexed { index, string ->
//        println("Нажат элемент $string")
//        index % 2 == 0
//    }

//    val clickEvenCategories =
}
