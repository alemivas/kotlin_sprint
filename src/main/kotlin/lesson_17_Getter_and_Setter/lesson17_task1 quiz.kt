package lesson_17_Getter_and_Setter

fun main() {
    println("=== Викторина ===")
    println()
    val quizItem = QuizItem(
        question = "How many?", answer = "7"
    )
    println(quizItem.question)
    println(quizItem.answer)
    quizItem.answer = "10"
    println(quizItem.answer)
}

class QuizItem(
    question: String,
    answer: String,
) {
    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}
