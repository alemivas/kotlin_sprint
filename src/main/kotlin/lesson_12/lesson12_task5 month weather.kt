package org.example.lesson_12

import kotlin.random.Random

fun main() {
    println("=== Погода за месяц ===")
    val temperatureRange = MIN_TEMPERATURE..MAX_TEMPERATURE
    val weatherDayList = (1..DAY_IN_MONTH).map {
        WeatherDay(
            dayTemperature = temperatureRange.random(),
            nightTemperature = temperatureRange.random(),
            hasPrecipitation = Random.nextBoolean(),
        )
    }

    val averageDayTemperature = weatherDayList.map { it.dayTemperature }.average().toInt()
    val averageNightTemperature = weatherDayList.map { it.nightTemperature }.average().toInt()
    val precipitationDayAmount = weatherDayList.count { it.hasPrecipitation }

    println()
    println("Средняя дневная температура за месяц: $averageDayTemperature °C")
    println("Средняя ночная температура за месяц: $averageNightTemperature °C")
    println("Количество дней с осадками за месяц: $precipitationDayAmount")
}

class WeatherDay(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val hasPrecipitation: Boolean,
)

const val DAY_IN_MONTH = 30
const val MIN_TEMPERATURE = 5
const val MAX_TEMPERATURE = 35