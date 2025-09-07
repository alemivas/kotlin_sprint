package org.example.lesson_5

fun main() {

    println("Введите ваш вес (в килограммах)")
    val mass = readln().toFloat()
    println("Введите ваш рост (в сантиметрах)")
    val height = readln().toFloat()

    val heightInMeters = height / CM_IN_METER
    val bmi = mass / (heightInMeters * heightInMeters)

    val weightCategory = when {
        bmi < BMI_UNDERWEIGHT -> "Недостаточная масса тела"
        bmi < BMI_NORMAL_WEIGHT -> "Нормальная масса тела"
        bmi < BMI_OVERWEIGHT -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    val bmiInFormatString = "%.2f".format(bmi)

    println("Ваш индекс массы тела = $bmiInFormatString\n$weightCategory")

}

const val CM_IN_METER = 100
const val BMI_UNDERWEIGHT = 18.5f
const val BMI_NORMAL_WEIGHT = 25f
const val BMI_OVERWEIGHT = 30f