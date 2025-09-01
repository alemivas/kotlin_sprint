package org.example.lesson_4

const val WINTER = "winter"

fun main() {

    val isSunnyWeatherToday = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = WINTER

    val isFavorableConditions = isSunnyWeatherToday && isAwningOpen &&
            airHumidity == 20 && season != WINTER

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}