package org.example.lesson_18_Polymorphism

fun main() {
    println("=== Игральные кости с разным количеством граней ===")
    println()
    val fourFacesDice = FourFacesDice()
    val sixFacesDice = SixFacesDice()
    val eightFacesDice = EightFacesDice()
//    val dice = Dice()

    val diceList = listOf<Dice>(fourFacesDice, sixFacesDice, eightFacesDice)
    diceList.forEach {
        it.diceRoll()
    }
}

open class Dice() {
    open fun diceRoll() {}
}

class FourFacesDice() : Dice() {
    override fun diceRoll() {
        println("У четырехгранной кости выпало ${(1..4).random()}")
    }
}

class SixFacesDice() : Dice() {
    override fun diceRoll() {
        println("У шестигранной кости выпало ${(1..6).random()}")
    }
}

class EightFacesDice() : Dice() {
    override fun diceRoll() {
        println("У восьмигранной кости выпало ${(1..8).random()}")
    }
}
