package org.example.lesson_12

fun main() {
    println("=== Погода по дням ===")

    val weatherDay = WeatherPCWoP(
        _dayTemperatureInKelvin = 298,
        _nightTemperatureInKelvin = 290,
        _hasPrecipitation = false,
    )

    weatherDay.printInfo()
}

class WeatherPCWoP(
    _dayTemperatureInKelvin: Int,
    _nightTemperatureInKelvin: Int,
    _hasPrecipitation: Boolean,
) {
    var dayTemperature = _dayTemperatureInKelvin - KELVIN_TO_CELSIUS
    var nightTemperature = _nightTemperatureInKelvin - KELVIN_TO_CELSIUS
    var hasPrecipitation = _hasPrecipitation

    fun printInfo() {
        println()
        println("Погода на день:")
        println("Дневная температура: $dayTemperature °C")
        println("Ночная температура: $nightTemperature °C")
        val precipitationText = if (hasPrecipitation) "Да" else "Нет"
        println("Наличие осадков: $precipitationText")
    }
}

const val KELVIN_TO_CELSIUS = 273