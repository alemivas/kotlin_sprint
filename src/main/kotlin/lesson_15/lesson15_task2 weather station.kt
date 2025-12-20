package org.example.lesson_15

fun main() {
    println("=== Система мониторинга погодных условий ===")


}

abstract class WeatherStationStats {
    //возмо задать свво число
    // и/или метод printAmount
}

class Temperature(
    val number: Int,
) : WeatherStationStats() {

}

class PrecipitationAmount : WeatherStationStats() {

}

class WeatherServer {
    fun sendMessageToServer(message: WeatherStationStats) {
        println()
    }
}