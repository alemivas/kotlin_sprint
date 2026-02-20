package org.example.lesson_19_Enum_Todo_Nothing

fun main() {
    println("=== Космический корабль ===")
    println()
    val spacecraft = Spacecraft()
    spacecraft.takeOff()
    spacecraft.land()
    spacecraft.shoot()
}

class Spacecraft {
    fun takeOff() {
        // TODO нужна информация о дополнительной логике
    }

    fun land() {}

    fun shoot() {
        TODO("нужна реализация")
    }
}
