package org.example.lesson_5

fun main() {

    println("Введите ваш вес (в килограммах)")
    val mass = readln().toFloat()
    println("Введите ваш рост (в сантиметрах)")
    val height = readln().toFloat()

    val heightInMeters = height / CM_IN_METER

    val bmi = mass / (heightInMeters * heightInMeters)

    val weightCategory = when {
        bmi < WEIGHT_CATEGORY_SEPARATOR_1 -> "Недостаточная масса тела"
        bmi < WEIGHT_CATEGORY_SEPARATOR_2 -> "Нормальная масса тела"
        bmi < WEIGHT_CATEGORY_SEPARATOR_3 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    val bmiInFormatString = "%.2f".format(bmi)

    println("Ваш индекс массы тела = $bmiInFormatString\n$weightCategory")

}

const val CM_IN_METER = 100
const val WEIGHT_CATEGORY_SEPARATOR_1 = 18.5f
const val WEIGHT_CATEGORY_SEPARATOR_2 = 25f
const val WEIGHT_CATEGORY_SEPARATOR_3 = 30f