package org.example.lesson_9

fun main() {
    println("=== Рассчет количества ингредиентов ===")
    println()
    val ingredientsAmountForOneServing = listOf(2, 50, 15)
    println("Для одной порции нужно: " +
            "Яиц – ${ingredientsAmountForOneServing[0]} шт., " +
            "молока – ${ingredientsAmountForOneServing[1]} мл, " +
            "сливочного масла – ${ingredientsAmountForOneServing[2]} г"
    )
    println()
    println("Сколько порций хотите приготовить?")
    val servingsAmount = readln().toInt()
    val ingredientsAmountForServingsAmount = ingredientsAmountForOneServing.map { it * servingsAmount }
    println("На $servingsAmount порций вам понадобится: " +
            "Яиц – ${ingredientsAmountForServingsAmount[0]} шт., " +
            "молока – ${ingredientsAmountForServingsAmount[1]} мл, " +
            "сливочного масла – ${ingredientsAmountForServingsAmount[2]} г"
    )
}