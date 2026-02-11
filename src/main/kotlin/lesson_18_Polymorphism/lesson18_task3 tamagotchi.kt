package org.example.lesson_18_Polymorphism

fun main() {
    println("=== Тамагочи ===")
    println()
    val fox = Fox(name = "Алиса")
    val dog = Dog(name = "Артемон")
    val cat = Cat(name = "Базилио")
    val tamagotchiAnimalList = listOf<TamagotchiAnimal>(fox, dog, cat)
    tamagotchiAnimalList.forEach {
        it.eat()
    }
}

abstract class TamagotchiAnimal {
    abstract val name: String
    abstract fun eat()
    abstract fun sleep()
}

class Fox(
    override val name: String
) : TamagotchiAnimal() {
    override fun eat() {
        println("Лиса $name -> ест ягоды")
    }

    override fun sleep() {
        println("Лиса $name -> спит")
    }
}

class Dog(
    override val name: String
) : TamagotchiAnimal() {
    override fun eat() {
        println("Собака $name -> ест кости")
    }

    override fun sleep() {
        println("Собака $name -> спит")
    }
}

class Cat(
    override val name: String
) : TamagotchiAnimal() {
    override fun eat() {
        println("Кошка $name -> ест рыбу")
    }

    override fun sleep() {
        println("Кошка $name -> спит")
    }
}
