package org.example.lesson_4

fun main() {

    println("Корабль имеет повреждения? (true/false)")
    val isCaseDamage = readln().toBoolean()

    println("Текущий состав экипажа?")
    val crewComposition = readln().toInt()

    println("Количество ящиков с провизией на борту?")
    val boxesOfProvisionsNumbers = readln().toInt()

    println("Благоприятность метеоусловий? (true/false)")
    val isFavorableWeatherConditions = readln().toBoolean()

    val canShipGoSailing = (
            !isCaseDamage &&
            crewComposition in 55..70 &&
            boxesOfProvisionsNumbers > 50
            ) || (
            crewComposition == 70 &&
            isFavorableWeatherConditions &&
            boxesOfProvisionsNumbers >= 50
            )

    println("может ли корабль отправиться в плавание? $canShipGoSailing")

}