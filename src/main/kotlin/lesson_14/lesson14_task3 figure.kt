package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    println("=== Геометрические фигуры ===")
    println()
    val figureList = listOf(
        Round(color = FigureColor.BLACK, radius = 20),
        Rectangle(color = FigureColor.BLACK, width = 15, height = 10),
        Round(color = FigureColor.WHITE, radius = 10),
        Rectangle(color = FigureColor.WHITE, width = 10, height = 10),
        Round(color = FigureColor.BLACK, radius = 10),
        Rectangle(color = FigureColor.WHITE, width = 20, height = 10),
    )

    val blackFigurePerimeterSum = figureList
        .filter { it.color == FigureColor.BLACK }
        .sumOf { it.calculatePerimeter() }
        .roundToInt()
    println("Сумма периметров всех ${FigureColor.BLACK.value} фигур = $blackFigurePerimeterSum")

    val whiteFigureSquareSum = figureList
        .filter { it.color == FigureColor.WHITE }
        .sumOf { it.calculateArea() }
        .roundToInt()
    println("Сумма площадей всех ${FigureColor.WHITE.value} фигур = $whiteFigureSquareSum")
}

abstract class Figure(
    val color: FigureColor,
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Round(
    color: FigureColor,
    val radius: Int,
) : Figure(color) {
    override fun calculateArea() = PI * radius.toDouble().pow(2)

    override fun calculatePerimeter() = 2 * PI * radius
}

class Rectangle(
    color: FigureColor,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun calculateArea() = (width * height).toDouble()

    override fun calculatePerimeter() = (width + height) * 2.toDouble()
}

enum class FigureColor(val value: String) {
    WHITE("белых"), BLACK("черных"),
}