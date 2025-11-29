package org.example.lesson_14

fun main() {
    println("=== Корабли ===")
    val liner1 = Liner()
    val cargoShip1 = CargoShip()
    val icebreaker1 = Icebreaker()
}

open class Liner(
    val speed: Int = 100,
    val carryingCapacity: Int = 5,
    val passengerCapacity: Int = 1000,
)

class CargoShip(
) : Liner(
    speed = 50,
    carryingCapacity = 70,
    passengerCapacity = 0,
)

class Icebreaker(
    val canBreakIce: Boolean = true,
) : Liner(
    speed = 30,
    carryingCapacity = 10,
    passengerCapacity = 100
)