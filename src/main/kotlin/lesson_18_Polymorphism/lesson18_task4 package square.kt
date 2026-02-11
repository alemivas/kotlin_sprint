package org.example.lesson_18_Polymorphism

import kotlin.math.pow

fun main() {
    println("=== Площадь упаковки посылки ===")
    println()
    val boxList = listOf(
        RectangleBox(length = 3, width = 4, height = 5),
        CubeBox(edge = 10)
    )
    boxList.forEach {
        println("Площадь поверхности посылки ${it.boxSurfaceArea()}")
    }
}

abstract class Box {
    abstract fun boxSurfaceArea(): Int
}

class RectangleBox(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Box() {
    override fun boxSurfaceArea() = (length * width + length * height + width * height) * 2
}

class CubeBox(
    private val edge: Int,
) : Box() {
    override fun boxSurfaceArea() = (edge.toDouble().pow(2) * 6).toInt()
}
