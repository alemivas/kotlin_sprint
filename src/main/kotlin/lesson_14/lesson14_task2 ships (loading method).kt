package org.example.lesson_14

fun main() {
    println("=== Корабли ===")

    println()
    val liner1 = Liner2(name = "Лайнер1")
    liner1.loadShip()
    liner1.printInfo()

    println()
    val cargoShip1 = CargoShip2(name = "Грузовой1")
    cargoShip1.loadShip()
    cargoShip1.printInfo()

    println()
    val icebreaker1 = Icebreaker2(name = "Ледокол1")
    icebreaker1.loadShip()
    icebreaker1.printInfo()
}

open class Liner2(
    val name: String,
    val speed: Int = 100,
    val carryingCapacity: Int = 5,
    val passengerCapacity: Int = 1000,
) {
    open fun loadShip() {
        println("Погрузка $name: выдвинут горизонтальный трап со шкафута")
    }

    open fun printInfo() {
        println("Название корабля: $name")
        println("Скорость: $speed")
        println("Грузоподъемность: $carryingCapacity")
        println("Вместимость пассажиров: $passengerCapacity")
    }
}

class CargoShip2(
    name: String,
) : Liner2(
    name,
    speed = 50,
    carryingCapacity = 70,
    passengerCapacity = 0,
) {
    override fun loadShip() {
        println("Погрузка $name: активирован погрузочный кран")
    }
}

class Icebreaker2(
    name: String,
    val canBreakIce: Boolean = true,
) : Liner2(
    name,
    speed = 30,
    carryingCapacity = 10,
    passengerCapacity = 100
) {
    override fun loadShip() {
        println("Погрузка $name: открыты ворота со стороны кормы")
    }

    override fun printInfo() {
        super.printInfo()
        println("Может ломать лед: ${if (canBreakIce) "Да" else "Нет"}")
    }
}