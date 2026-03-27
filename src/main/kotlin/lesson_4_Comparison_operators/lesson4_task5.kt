package org.example.lesson_4

fun main() {

    println("Корабль не имеет повреждения? (true/false)")
    val isCaseNotDamage = readln().toBoolean()

    println("Текущий состав экипажа?")
    val crewComposition = readln().toInt()

    println("Количество ящиков с провизией на борту?")
    val boxesOfProvisionsNumbers = readln().toInt()

    println("Благоприятность метеоусловий? (true/false)")
    val isFavorableWeatherConditions = readln().toBoolean()

    val canShipGoSailing = (
            isCaseNotDamage == CASE_NOT_DAMAGE &&
            crewComposition in MINIMUM_CREW_COMPOSITION..RECOMMENDED_CREW_COMPOSITION &&
            boxesOfProvisionsNumbers > MINIMUM_BOXES_OF_PROVISIONS_NUMBERS
            ) || (
            crewComposition == RECOMMENDED_CREW_COMPOSITION &&
            isFavorableWeatherConditions == FAVORABLE_WEATHER_CONDITIONS &&
            boxesOfProvisionsNumbers >= MINIMUM_BOXES_OF_PROVISIONS_NUMBERS
            )

    println("может ли корабль отправиться в плавание? $canShipGoSailing")

}

const val CASE_NOT_DAMAGE = true
const val MINIMUM_CREW_COMPOSITION = 55
const val RECOMMENDED_CREW_COMPOSITION = 70
const val MINIMUM_BOXES_OF_PROVISIONS_NUMBERS = 50
const val FAVORABLE_WEATHER_CONDITIONS = true