package org.example.lesson_4

fun main() {

    val trainingDay = 5

    val isExercisesForHandsAndPress = (trainingDay % 2) == 1
    val isExercisesForLegsAndBack = (trainingDay % 2) == 0

    println("""
        Упражнения для рук:    $isExercisesForHandsAndPress
        Упражнения для ног:    $isExercisesForLegsAndBack
        Упражнения для спины:  $isExercisesForLegsAndBack
        Упражнения для пресса: $isExercisesForHandsAndPress
    """.trimIndent())

}