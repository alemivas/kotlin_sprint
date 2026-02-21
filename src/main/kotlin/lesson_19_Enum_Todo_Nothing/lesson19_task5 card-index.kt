package org.example.lesson_19_Enum_Todo_Nothing

fun main() {
    println("=== Картотека ===")
    println()
    println("Заполните картотеку на $PERSON_AMOUNT человек")
    println("Нужно ввести Имя и Пол " +
            "\"${Gender.MALE.shortValue}\" (${Gender.MALE.value}) или " +
            "\"${Gender.FEMALE.shortValue}\" (${Gender.FEMALE.value})")
    val cardIndex = mutableListOf<Person>()

    for (i in 1..PERSON_AMOUNT) {
        println()
        print("Введите Имя: ")
        val name = readln()
        print("Введите Пол: ")
        val stringGender = readln()
        when (stringGender) {
            Gender.MALE.shortValue -> {
                cardIndex.add(Person(name = name, gender = Gender.MALE))
            }

            Gender.FEMALE.shortValue -> {
                cardIndex.add(Person(name = name, gender = Gender.FEMALE))
            }

            else -> println("Пол введен не корректно. Человек не добавлен в картотеку")
        }
    }

    println()
    println("Картотека заполнена:")
    cardIndex.forEach { person ->
        println("Имя: ${person.name}, Пол: ${person.gender.value}")
    }
}

class Person(
    val name: String,
    val gender: Gender,
)

enum class Gender(val value: String, val shortValue: String) {
    MALE("Мужской", "м"),
    FEMALE("Женский", "ж"),
}

const val PERSON_AMOUNT = 5
