package org.example.lesson_5

fun main() {

    println("Введите ваш вес (в килограммах)")
    val mass = readln().toFloat()
    println("Введите ваш рост (в сантиметрах)")
    val height = readln().toFloat()

    val heightInMeters = height / 100

    val bmi = mass / (heightInMeters * heightInMeters)

    val weightCategory = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi >= 18.5 && bmi < 25 -> "Нормальная масса тела"
        bmi >= 25 && bmi < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    val bmiInFormatString = "%.2f".format(bmi)

    println("Ваш индекс массы тела = $bmiInFormatString\n$weightCategory")

}