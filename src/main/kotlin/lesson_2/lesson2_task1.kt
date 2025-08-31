package org.example.lesson_2

fun main() {

    val studentMark1 = 3
    val studentMark2 = 4
    val studentMark3 = 3
    val studentMark4 = 5

    val numbersOfStudent = 4

    val averageMark: Float = (studentMark1 + studentMark2 +
            studentMark3 + studentMark4).toFloat() / numbersOfStudent

    println("%.2f".format(averageMark))

}