package org.example.lesson_18_Polymorphism

fun main() {
    println("=== Игральные кости с разным количеством граней ===")
    println()
    val fourFacesDice = FourFacesDice()
    val sixFacesDice = SixFacesDice()
    val eightFacesDice = EightFacesDice()
    val diceList = listOf<Dice>(fourFacesDice, sixFacesDice, eightFacesDice)
    diceList.forEach { it.diceRoll() }
}

abstract class Dice {
    abstract val facesNumber: Int
    abstract fun diceRoll()
}

class FourFacesDice : Dice() {
    override val facesNumber = 4
    override fun diceRoll() {
        println("У четырехгранной кости выпало ${(1..facesNumber).random()}")
    }
}

class SixFacesDice : Dice() {
    override val facesNumber = 6
    override fun diceRoll() {
        println("У шестигранной кости выпало ${(1..facesNumber).random()}")
    }
}

class EightFacesDice : Dice() {
    override val facesNumber = 8
    override fun diceRoll() {
        println("У восьмигранной кости выпало ${(1..facesNumber).random()}")
    }
}
