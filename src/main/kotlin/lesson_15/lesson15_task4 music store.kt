package org.example.lesson_15

fun main() {
    println("=== Музыкальный магазин ===")

    val drum = Instrument("Барабан", 3)
    drum.find()

    val drumsticks = Components("барабанные палочки", 5)
}

abstract class Product {
    abstract val name: String
    abstract val amount: Int
}

class Instrument(
    override val name: String,
    override val amount: Int
) : Product(), Findable {
    override fun find() {
        println("Выполняется поиск комплектующих")
    }
}

class Components(
    override val name: String,
    override val amount: Int
) : Product()

interface Findable {
    fun find()
}