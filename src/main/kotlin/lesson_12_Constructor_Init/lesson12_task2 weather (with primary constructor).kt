package org.example.lesson_12

fun main() {
    println("=== Погода по дням ===")

    val weatherDay = WeatherWPC(
        dayTemperature = 25,
        nightTemperature = 20,
        isPrecipitation = false,
    )

    weatherDay.printInfo()
}

class WeatherWPC(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isPrecipitation: Boolean,
) {
    fun printInfo() {
        println()
        println("Погода на день:")
        println("Дневная температура: $dayTemperature °C")
        println("Ночная температура: $nightTemperature °C")
        val precipitationText = if (isPrecipitation) "Да" else "Нет"
        println("Наличие осадков: $precipitationText")
    }
}