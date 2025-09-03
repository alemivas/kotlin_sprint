package org.example.lesson_4

fun main() {

    val trainingDay = 5

    val isExercisesForHandsAndPress = (trainingDay % 2) == 1

    println("""
        Упражнения для рук:    $isExercisesForHandsAndPress
        Упражнения для ног:    ${!isExercisesForHandsAndPress}
        Упражнения для спины:  ${!isExercisesForHandsAndPress}
        Упражнения для пресса: $isExercisesForHandsAndPress
    """.trimIndent())

}