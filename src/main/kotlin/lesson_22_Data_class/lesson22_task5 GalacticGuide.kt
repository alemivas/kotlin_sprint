package org.example.lesson_22_Data_class

fun main() {
    println("=== GalacticGuide ===")
    val galacticGuideList = mutableListOf<GalacticGuide>()
    galacticGuideList.add(
        GalacticGuide(
            name = "Alpha Centauri",
            description = "Closest star system to Earth",
            dateTime = null,
            distance = 4.37,
        )
    )

    for (galacticGuide in galacticGuideList) {
        println()
        println(
            "Name of place or event: ${galacticGuide.component1()}\n" +
            "Description of place or event: ${galacticGuide.component2()}\n" +
            "Date and time of event: ${galacticGuide.component3() ?: "<no data>"}\n" +
            "Distance of a place or event from Earth in light years: ${galacticGuide.component4()}"
        )
    }
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String?,
    val distance: Double,
)
