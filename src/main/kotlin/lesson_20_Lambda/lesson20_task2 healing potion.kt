package org.example.lesson_20_Lambda

fun main() {
    println("=== Лечебное зелье ===")
    println()
    val player1 = Player(name = "Zub", health = 54)
    val takeHealingPotion: (Player) -> Unit = { player: Player ->
        println()
        println("Игрок ${player.name} подобрал и применил зелье")
        println("Здоровье восстановлено из ${player.health} в ${player.maxHealth}")
        player.health = player.maxHealth
    }
    takeHealingPotion(player1)
}

class Player(
    val name: String,
    var health: Int,
) {
    val maxHealth: Int = 100

    init {
        println("Создан игрок по имени $name")
        println("Текущее здоровье $health из $maxHealth")
    }
}
