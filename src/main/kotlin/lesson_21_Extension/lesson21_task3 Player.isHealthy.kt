package org.example.lesson_21_Extension

fun main() {
    println("=== Лечебное зелье. Проверка здоровья ===")
    println()
    val player1 = Player(name = "Zub", health = 54, maxHealth = 100)
    println()
    println("Здоровье игрока максимально? ${player1.isHealthy()}")
    val takeHealingPotion: (Player) -> Unit = { player: Player ->
        println()
        println("Игрок ${player.name} подобрал и применил зелье")
        println("Здоровье восстановлено из ${player.health} в ${player.maxHealth}")
        player.health = player.maxHealth
    }
    takeHealingPotion(player1)
    println()
    println("Здоровье игрока максимально? ${player1.isHealthy()}")
}

class Player(
    val name: String,
    var health: Int,
    val maxHealth: Int,
) {
    init {
        println("Создан игрок по имени $name")
        println("Текущее здоровье $health из $maxHealth")
    }
}

fun Player.isHealthy() = health == maxHealth
