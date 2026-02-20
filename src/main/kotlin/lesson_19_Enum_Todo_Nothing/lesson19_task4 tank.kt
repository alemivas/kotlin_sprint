package org.example.lesson_19_Enum_Todo_Nothing

fun main() {
    println("=== Танк ===")
    println()
    val tank = Tank()
    tank.shoot()
    tank.takeCartridge(Cartridge.BLUE)
    tank.shoot()
    tank.takeCartridge(Cartridge.RED)
    tank.shoot()
}

class Tank {
    private var cartridge = Cartridge.NO_CARTRIDGE

    fun takeCartridge(takenCartridge: Cartridge) {
        cartridge = takenCartridge
        println("Танк подобрал ${cartridge.rusName}")
    }

    fun shoot() {
        if (cartridge != Cartridge.NO_CARTRIDGE)
            println("Танк выстрелил. Нанес урон: ${cartridge.damage}")
        else
            println("Нет патронов для выстрела")
    }
}

enum class Cartridge(val rusName: String, val damage: Int) {
    BLUE("Синие патроны", 5),
    GREEN("Зеленые патроны", 10),
    RED("Красные патроны", 20),
    NO_CARTRIDGE("Нет патронов", 0),
}
