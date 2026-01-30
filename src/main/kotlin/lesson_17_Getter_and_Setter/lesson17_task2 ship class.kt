package org.example.lesson_17_Getter_and_Setter

fun main() {
    println("=== Класс Корабль ===")
    println()
    val ship = Ship(name = "Быстрый", averageSpeed = 50, homePort = "Мурманск")
    ship.name = "Скорый"
    println("Имя корабля ${ship.name}")
}

class Ship(
    name: String,
    private val averageSpeed: Int,
    private val homePort: String,
) {
    init {
        println("Создан корабль $name")
    }

    var name = name
        set(value) {
            println("Имя корабля менять нельзя")
        }
}
