package org.example.lesson_16

import kotlin.math.pow

fun main() {
    println("=== Длина окружности и площадь круга ===")

    val circle = Circle(radius = 10)
    println()
    val circumference = "%.2f".format(circle.calculateCircumference())
    println("Длина окружности = $circumference")
    val circleArea = "%.2f".format(circle.calculateArea())
    println("Площадь круга = $circleArea")
}

class Circle(
    private val radius: Int
) {
    fun calculateCircumference() = 2 * PI * radius

    fun calculateArea() = PI * radius.toDouble().pow(2)
}

private const val PI = 3.14