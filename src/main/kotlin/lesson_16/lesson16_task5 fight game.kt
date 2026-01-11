package org.example.lesson_16

fun main() {
    println("=== Бой с уроном и лечением ===")
    println()
    val player = Player(name = "Subzero")

    player.receiveDamage(damage = 50)
    player.receiveDamage(damage = 20)
    player.heal(healAmount = 50)
    player.receiveDamage(damage = 40)
    player.receiveDamage(damage = 50)
    player.heal(healAmount = 30)
}

class Player(
    val name: String,
) {
    private var health: Int = 100
    private var hittingPower: Int = 30

    init {
        println("Создан игрок $name с уровнем здоровья $health и силой удара $hittingPower")
    }

    fun receiveDamage(damage: Int) {
        health -= damage
        print("$name получил урон на $damage")
        if (health > 0)
            println(". Уровень здоровья $health")
        else
            kill()
    }

    fun heal(healAmount: Int) {
        if (health != 0) {
            health += healAmount
            println("$name получил лечение на $healAmount. Уровень здоровья $health")
        } else
            println("Нельзя лечить убитого игрока")
    }

    private fun kill() {
        hittingPower = 0
        health = 0
        println(". Уровень здоровья $health")
        println("$name убит")
    }
}