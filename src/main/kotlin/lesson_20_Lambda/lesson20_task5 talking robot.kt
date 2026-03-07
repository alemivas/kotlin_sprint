package org.example.lesson_20_Lambda

fun main() {
    println("=== Говорящий робот ===")
    println()
    val robot = Robot()
    val modifier: (String) -> String = { it.reversed() }
    robot.say()
    robot.setModifier(modifier)
    robot.say()
}

class Robot {
    private val phraseList = listOf("Привет!", "Здравствуйте!", "Добрый день!", "Салют!", "Хеллоу!")
    private var phrase = phraseList.random()

    fun say() {
        println(phrase)
    }

    fun setModifier(modifier: (String) -> String) {
        phrase = modifier(phrase)
    }
}
