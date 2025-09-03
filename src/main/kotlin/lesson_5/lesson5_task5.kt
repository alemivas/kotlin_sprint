package org.example.lesson_5

fun main() {

    // формирование списка загаданных чисел
    val randomRange = MINIMUM_NUMBER..MAXIMUM_NUMBER
    val hiddenNumberList: MutableList<Int> = mutableListOf()
    for (i in 1..HIDDEN_NUMBERS_AMOUNT) {
        val hiddenNumber = randomRange.random()
        hiddenNumberList.add(hiddenNumber)
    }

    println("Угадайте $HIDDEN_NUMBERS_AMOUNT числа от $MINIMUM_NUMBER до $MAXIMUM_NUMBER")

    // формирование списка отгадываемых пользователем чисел
    val guessNumberList: MutableList<Int> = mutableListOf()
    for (i in 1..HIDDEN_NUMBERS_AMOUNT) {
        println("Введите $i-е число")
        val guessNumber = readln().toInt()
        guessNumberList.add(guessNumber)
    }

    // определение кол-ва совпадений
    val guessNumbersAmount = hiddenNumberList.intersect(guessNumberList).size

    val winningMessage = when (guessNumbersAmount) {
        3 -> "Вы угадали все числа и выиграли джекпот!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз!"
        else -> "Вы не угадали ни одного числа"
    }
    println(winningMessage)

    print("Загаданные числа были: ")
    for (number in hiddenNumberList)
        print("$number, ")

}

const val MINIMUM_NUMBER = 0
const val MAXIMUM_NUMBER = 42
const val HIDDEN_NUMBERS_AMOUNT = 3