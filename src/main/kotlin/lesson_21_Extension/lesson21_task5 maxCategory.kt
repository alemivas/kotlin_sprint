package org.example.lesson_21_Extension

fun main() {
    println("=== Самый прокачанный навык ===")
    println()
    val experience = mapOf(
        "Урон" to 30,
        "Защита" to 70,
        "Скорость" to 35,
        "Магия" to 70,
    )
    println("Самый прокачанный навык: ${experience.maxCategory()}")
}

fun Map<String, Int>.maxCategory(): String {
    return maxBy { it.value }.key
}
