package org.example.lesson_18_Polymorphism

fun main() {
    println("=== Рисование фигур ===")
    println()
    val screen = Screen()
    println(screen.draw(figureType = Circle(), x = 10, y = 5))
    println(screen.draw(figureType = Circle(), x = 20.0f, y = 5.3f))
    println(screen.draw(figureType = Square(), x = 100, y = 50))
    println(screen.draw(figureType = Square(), x = 80f, y = 30.7f))
    println(screen.draw(figureType = Dot(), x = 20, y = 50))
    println(screen.draw(figureType = Dot(), x = 100.9f, y = 70f))
}

class Screen {
    fun draw(
        figureType: Circle,
        x: Int,
        y: Int,
    ) = "Нарисован ${figureType.typeName} с координатами ($x, $y)"

    fun draw(
        figureType: Circle,
        x: Float,
        y: Float,
    ) = "Нарисован ${figureType.typeName} с координатами ($x, $y)"

    fun draw(
        figureType: Square,
        x: Int,
        y: Int,
    ) = "Нарисован ${figureType.typeName} с координатами ($x, $y)"

    fun draw(
        figureType: Square,
        x: Float,
        y: Float,
    ) = "Нарисован ${figureType.typeName} с координатами ($x, $y)"

    fun draw(
        figureType: Dot,
        x: Int,
        y: Int,
    ) = "Нарисована ${figureType.typeName} с координатами ($x, $y)"

    fun draw(
        figureType: Dot,
        x: Float,
        y: Float,
    ) = "Нарисована ${figureType.typeName} с координатами ($x, $y)"
}

abstract class Figure(val typeName: String)

class Circle : Figure(typeName = "Круг")

class Square : Figure(typeName = "Квадрат")

class Dot : Figure(typeName = "Точка")
