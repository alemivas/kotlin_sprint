package org.example.lesson_15

fun main() {
    println("=== Система мониторинга погодных условий ===")
    val weatherServer = WeatherServer()

    val temperature = Temperature(weatherStationStatsAmount = 20)
    weatherServer.sendMessageToServer(stats = temperature)

    val precipitationAmount = PrecipitationAmount(weatherStationStatsAmount = 5)
    weatherServer.sendMessageToServer(stats = precipitationAmount)
}

abstract class WeatherStationStats {
    abstract val weatherStationStatsAmount: Int
    abstract fun getWeatherStationStatsMessage(): String
}

class Temperature(
    override val weatherStationStatsAmount: Int,
) : WeatherStationStats() {
    override fun getWeatherStationStatsMessage() =
        "Температура $weatherStationStatsAmount °C"
}

class PrecipitationAmount(
    override val weatherStationStatsAmount: Int
) : WeatherStationStats() {
    override fun getWeatherStationStatsMessage() =
        "Количество осадков $weatherStationStatsAmount мм"
}

class WeatherServer {
    fun sendMessageToServer(stats: WeatherStationStats) {
        println()
        println("Сообщение отправленно на сервер:")
        println(stats.getWeatherStationStatsMessage())
    }
}