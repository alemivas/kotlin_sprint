package org.example.lesson_20_Lambda

fun main() {
    println("=== Говорящий робот ===")
    println()
    val robot = Robot()
    robot.say()
    val modifier: (String) -> String = { it.reversed() }
    robot.setModifier(modifier)
    robot.say()
}

class Robot {
    private val phraseList = listOf("Привет!", "Здравствуйте!", "Добрый день!", "Салют!", "Хеллоу!")
    private var phraseModifier: (String) -> String = { it }

    init {
        println("(Создан говорящий робот без модификатора речи)")
    }

    fun say() {
        var phrase = phraseList.random()
        phrase = phraseModifier(phrase)
        println(phrase)
    }

    fun setModifier(newModifier: (String) -> String) {
        phraseModifier = newModifier
        println("(Установлен модификатор речи)")
    }
}
