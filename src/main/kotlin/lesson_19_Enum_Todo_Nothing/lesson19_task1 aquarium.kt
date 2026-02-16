package org.example.lesson_19_Enum_Todo_Nothing

fun main() {
    println("=== Аквариум ===")
    println()
    println("Вы можете добавить в свой аквариум следующие виды рыб:")
    Fish.entries.forEach { fish ->
        println("${fish.ordinal + 1}. ${fish.rusName} (${formatConstant(fish.name)})")
    }
}

enum class Fish(val rusName: String) {
    GUPPY(rusName = "Гуппи"),
    ANGELFISH(rusName = "Скалярия"),
    GOLDFISH(rusName = "Золотая рыбка"),
    SIAMESE_FIGHTING_FISH(rusName = "Петушок"),
}

fun formatConstant(name: String) =
    name.replace("_", " ")
        .lowercase()
        .replaceFirstChar { it.uppercase() }
