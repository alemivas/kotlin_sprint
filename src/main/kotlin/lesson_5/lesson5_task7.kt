package org.example.lesson_5

fun main() {

    println("Введите расстояние поездки (в километрах)")
    val distance = readln().toFloat()
    println("Введите расход топлива на 100 км (в литрах)")
    val fuelConsumption = readln().toFloat()
    println("Введите текущую цену за литр топлива")
    val cost = readln().toFloat()

    val totalFuelConsumption = distance * fuelConsumption / 100
    val totalCost = totalFuelConsumption * cost

    println("Общее количество необходимого топлива = ${"%.2f".format(totalFuelConsumption)} л")
    println("Итоговая стоимость поездки = ${"%.2f".format(totalCost)} р.")

}