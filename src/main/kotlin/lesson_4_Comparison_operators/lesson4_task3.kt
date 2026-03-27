package org.example.lesson_4

fun main() {

    val isSunnyWeatherToday = FAVORABLE_SUNNY_WEATHER
    val isAwningOpen = FAVORABLE_AWNING_OPEN
    val airHumidity = FAVORABLE_AIR_HUMIDITY
    val season = WINTER

    val isFavorableConditions =
            isSunnyWeatherToday == FAVORABLE_SUNNY_WEATHER &&
            isAwningOpen == FAVORABLE_AWNING_OPEN &&
            airHumidity == FAVORABLE_AIR_HUMIDITY &&
            season != WINTER

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}

const val FAVORABLE_SUNNY_WEATHER = true
const val FAVORABLE_AWNING_OPEN = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val WINTER = "winter"
