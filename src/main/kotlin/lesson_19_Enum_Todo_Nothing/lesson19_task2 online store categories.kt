package org.example.lesson_19_Enum_Todo_Nothing

fun main() {
    println("=== Категории в интернет магазине ===")
    println()
    val ruler = Product(name = "Линейка", id = 25, category = Category.STATIONERY)
    val shorts = Product(name = "Шорты", id = 32, category = Category.CLOTHING)
    val skis = Product(name = "Лыжи", id = 18, category = Category.MISCELLANEOUS)
    ruler.printInfo()
    shorts.printInfo()
    skis.printInfo()
}

enum class Category {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getName() = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        MISCELLANEOUS -> "Разное"
    }
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun printInfo() {
        println("Товар: \"$name\", id: $id, Категория: \"${category.getName()}\"")
    }
}
