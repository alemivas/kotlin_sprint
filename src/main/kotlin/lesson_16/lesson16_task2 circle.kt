package org.example.lesson_16

import kotlin.math.pow

fun main() {
    println("=== Длина окружности и площадь круга ===")

    val circle = Circle(radius = 10.0)
    println()
    println("Длина окружности = ${"%.2f".format(circle.getCircumference())}")
    println("Площадь круга = ${"%.2f".format(circle.getArea())}")
}

class Circle(
    private val radius: Double
) {
    fun getCircumference() = 2 * PI * radius

    fun getArea() = PI * radius.pow(2)
}

private const val PI = 3.14