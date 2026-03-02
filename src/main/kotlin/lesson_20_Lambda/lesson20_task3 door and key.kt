package org.example.lesson_20_Lambda

fun main() {
    println("=== Дверь и ключ ===")
    println()
    val checkKey: (Gamer) -> String = { gamer: Gamer ->
        if (gamer.hasKey) "Игрок открыл дверь"
        else "Дверь заперта"
    }
    val gamer1 = Gamer(name = "Bob")
    println(checkKey(gamer1))
    gamer1.hasKey = true
    println(checkKey(gamer1))
}

class Gamer(
    name: String,
    var hasKey: Boolean = false,
) {
    init {
        println("Создан игрок по имени $name")
    }
}
