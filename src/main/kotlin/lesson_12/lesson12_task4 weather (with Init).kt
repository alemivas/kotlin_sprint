package org.example.lesson_12

fun main() {
    println("=== Погода по дням ===")

    val weatherDay = WeatherWI(
        dayTemperature = -10,
        nightTemperature = -15,
        hasPrecipitation = true,
    )
}

class WeatherWI(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var hasPrecipitation: Boolean,
) {
    init {
        printInfo()
    }

    fun printInfo() {
        println()
        println("Погода на день:")
        println("Дневная температура: $dayTemperature °C")
        println("Ночная температура: $nightTemperature °C")
        println("Наличие осадков: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}