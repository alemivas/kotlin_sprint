package org.example.lesson_12

fun main() {
    println("=== Погода по дням ===")

    val weatherDay1 = Weather()
    weatherDay1.dayTemperature = 20
    weatherDay1.nightTemperature = 15
    weatherDay1.precipitation = false
    weatherDay1.printInfo()
    val weatherDay2 = Weather()
    weatherDay2.dayTemperature = 16
    weatherDay2.nightTemperature = 13
    weatherDay2.precipitation = true
    weatherDay2.printInfo()

    println()
    println("Изменённые данные о погоде:")
    weatherDay1.dayTemperature = 10
    weatherDay1.nightTemperature = 7
    weatherDay1.precipitation = true
    weatherDay1.printInfo()
    weatherDay2.dayTemperature = 25
    weatherDay2.nightTemperature = 20
    weatherDay2.precipitation = false
    weatherDay2.printInfo()
}

class Weather {
    var dayTemperature = 0
    var nightTemperature = 0
    var precipitation = false

    fun printInfo() {
        println()
        println("Погода на день:")
        println("Дневная температура: $dayTemperature °C")
        println("Ночная температура: $nightTemperature °C")
        val precipitationText = if (precipitation) "Да" else "Нет"
        println("Наличие осадков: $precipitationText")
    }
}