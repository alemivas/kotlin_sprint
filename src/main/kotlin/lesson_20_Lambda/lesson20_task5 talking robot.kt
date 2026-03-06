package org.example.lesson_20_Lambda

fun main() {
    println("=== Говорящий робот ===")
    println()

}

class Robot {
    private var phrase = ""

    private val phraseList = listOf("первая фраза", "вторая фраза", "третья фраза", "четвертая фраза", "пятая фраза")

    private val modifier = { phrase = phrase.uppercase() }

    fun say() {
        phrase = phraseList.random()
        println(phrase)
    }

    fun setModifier(modifier: () -> Unit) {

    }
}

//enum class Phrase(val value: String) {
//    ONE("первая фраза"),
//    TWO("вторая фраза"),
//    THREE("третья фраза"),
//    FOUR("четвертая фраза"),
//    FIVE("пятая фраза"),
//}
