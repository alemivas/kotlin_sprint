package org.example.lesson_9

fun main() {
    println("=== Рассчет количества ингредиентов ===")
    println()
    val ingredientsAmount = mutableListOf(2, 50, 15)
    println("Для одной порции нужно: " +
            "Яиц – ${ingredientsAmount[0]} шт., " +
            "молока – ${ingredientsAmount[1]} мл, " +
            "сливочного масла – ${ingredientsAmount[2]} г"
    )
    println()
    println("Сколько порций хотите приготовить?")
    val servingsAmount = readln().toInt()
    ingredientsAmount.forEachIndexed { index, value ->
        ingredientsAmount[index] = value * servingsAmount
    }
    println("На $servingsAmount порций вам понадобится: " +
            "Яиц – ${ingredientsAmount[0]} шт., " +
            "молока – ${ingredientsAmount[1]} мл, " +
            "сливочного масла – ${ingredientsAmount[2]} г"
    )
}