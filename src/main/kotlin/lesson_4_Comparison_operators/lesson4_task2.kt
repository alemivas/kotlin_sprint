package org.example.lesson_4

fun main() {

    val minimumWeight = 35
    val maximumWeight = 100
    val maximumVolume = 100

    val cargoWeight1 = 20
    val cargoVolume1 = 80

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз соответствует категории \"Average\", если вес от $minimumWeight кг " +
            "(не включительно) до $maximumWeight кг (включительно), и объем меньше " +
            "$maximumVolume литров (не включительно).")

    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л " +
            "соответствует категории 'Average': " +
            "${cargoWeight1 > minimumWeight && 
                    cargoWeight1 <= maximumWeight && 
                    cargoVolume1 < maximumVolume}")

    println("Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л " +
            "соответствует категории 'Average': " +
            "${cargoWeight2 > minimumWeight &&
                    cargoWeight2 <= maximumWeight &&
                    cargoVolume2 < maximumVolume}")

}