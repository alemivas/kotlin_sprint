package org.example.lesson_18_Polymorphism

import kotlin.math.pow

fun main() {
    println("=== Площадь упаковки посылки ===")
    println()
    val boxList = listOf(
        RectangleBox(length = 3.0, width = 4.0, height = 5.0),
        CubeBox(edge = 10.0)
    )
    boxList.forEach {
        println("Площадь поверхности посылки ${it.boxSurfaceArea()}")
    }
}

abstract class Box {
    abstract fun boxSurfaceArea(): Double
}

class RectangleBox(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Box() {
    override fun boxSurfaceArea() = (length * width + length * height + width * height) * 2
}

class CubeBox(
    private val edge: Double,
) : Box() {
    override fun boxSurfaceArea() = edge.pow(2) * 6
}
