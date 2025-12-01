package org.example.lesson_14

fun main() {
    println("=== Небесные тела ===")

    val planet1 = Planet(
        name = "Planet1",
        hasAtmosphere = true,
        isSuitableLanding = true,
        satellites = listOf(
            Satellite(
                name = "satellite1",
                hasAtmosphere = false,
                isSuitableLanding = true
            ),
            Satellite(
                name = "satellite2",
                hasAtmosphere = true,
                isSuitableLanding = false
            ),
        ),
    )

    println()
    println("Планета: ${planet1.name}")
    planet1.satellites.forEach { println("Спутник: ${it.name}") }
}

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableLanding: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableLanding: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, hasAtmosphere, isSuitableLanding)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableLanding)