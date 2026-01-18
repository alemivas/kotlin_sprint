package lesson_17_Getter_and_Setter

fun main() {
    println("=== Викторина ===")
    println()
    val quizElement = QuizElement(
        _question = "How many?", _answer = "7"
    )
    println(quizElement.question)
    println(quizElement.answer)
    quizElement.answer = "10"
    println(quizElement.answer)
}

class QuizElement(
    _question: String,
    _answer: String,
) {
    val question = _question
        get() = field

    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}