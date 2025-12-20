package org.example.lesson_15

fun main() {
    println("=== Система мониторинга погодных условий ===")


}

abstract class WeatherStationStats {
    //возмо задать свво число
    abstract val weatherStationStatsAmount: Int

    // и/или метод printAmount
    abstract fun printWeatherStationStats()
}

class Temperature(
    override val weatherStationStatsAmount: Int,
) : WeatherStationStats() {
    override fun printWeatherStationStats() {
        println("Температура $weatherStationStatsAmount °C")
    }

}

class PrecipitationAmount(
    override val weatherStationStatsAmount: Int
) : WeatherStationStats() {
    override fun printWeatherStationStats() {
        println("Количество осадков $weatherStationStatsAmount мм")
    }

}

class WeatherServer {
    fun sendMessageToServer(message: WeatherStationStats) {
        println()
    }
}