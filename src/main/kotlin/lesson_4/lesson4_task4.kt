package org.example.lesson_4

fun main() {

    val trainingDay = 5

    val isExercisesForHands = (trainingDay % 2) == 1
    val isExercisesForPress = (trainingDay % 2) == 1
    val isExercisesForLegs = (trainingDay % 2) == 0
    val isExercisesForBack = (trainingDay % 2) == 0

    println("""
        Упражнения для рук:    $isExercisesForHands
        Упражнения для ног:    $isExercisesForLegs
        Упражнения для спины:  $isExercisesForBack
        Упражнения для пресса: $isExercisesForPress
    """.trimIndent())

}