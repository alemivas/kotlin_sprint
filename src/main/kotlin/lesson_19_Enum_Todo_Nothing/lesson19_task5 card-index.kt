package org.example.lesson_19_Enum_Todo_Nothing

fun main() {
    println("=== Картотека ===")
    println()
    println("Заполните картотеку на $PERSON_AMOUNT человек")
    println("Нужно ввести Имя и Пол " +
            "\"${Sex.MALE.shortValue}\" (${Sex.MALE.value}) или " +
            "\"${Sex.FEMALE.shortValue}\" (${Sex.FEMALE.value})")
    val cardIndex = mutableListOf<Person>()

    for (i in 1..PERSON_AMOUNT) {
        println()
        print("Введите Имя: ")
        val name = readln()
        val sex = readSex()
        cardIndex.add(Person(name = name, sex = sex))
    }

    println()
    println("Картотека заполнена:")
    cardIndex.forEach { person ->
        println("Имя: ${person.name}, Пол: ${person.sex.value}")
    }
}

fun readSex(): Sex {
    while (true) {
        print("Введите Пол: ")
        val stringSex = readln()
        when (stringSex.lowercase()) {
            Sex.MALE.shortValue -> return Sex.MALE
            Sex.FEMALE.shortValue -> return Sex.FEMALE
            else -> println("Пол введен не корректно.")
        }
    }
}

class Person(
    val name: String,
    val sex: Sex,
)

enum class Sex(val value: String, val shortValue: String) {
    MALE("Мужской", "м"),
    FEMALE("Женский", "ж"),
}

const val PERSON_AMOUNT = 5
