package org.example.lesson_15

fun main() {
    println("=== Летающие и плавающие существа ===")

    println()
    val crucianCarp = CrucianCarp()
    crucianCarp.swim()

    println()
    val seagull = Seagull()
    seagull.fly()

    println()
    val duck = Duck()
    duck.swim()
    duck.fly()
}

class CrucianCarp : Swimmable {
    override fun swim() {
        println("Карась плывет")
    }
}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка летит")
    }
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка летит")
    }

    override fun swim() {
        println("Утка плывет")
    }
}

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}