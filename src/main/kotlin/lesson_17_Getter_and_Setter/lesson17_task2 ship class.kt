package org.example.lesson_17_Getter_and_Setter

fun main() {
    println("=== Класс Корабль ===")
    println()
    val ship = Ship()
    ship.name = "fghfg"
    println(ship.name)
}

class Ship {
    var name: String = "имя по умолчанию"
        set(value) {
            println("Имя корабля менять нельзя")
        }

    val averageSpeed: Int = 0
    val homePort: String = ""
}