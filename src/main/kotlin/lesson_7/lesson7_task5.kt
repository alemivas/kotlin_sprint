package org.example.lesson_7

fun main() {
    println("=== Генератор паролей ===\n")
    println("Сколько символов должно быть в пароле? (минимальная длина пароля $MIN_SYMBOLS_AMOUNT символов)")
    var symbolsAmount = readln().toInt()
    if (symbolsAmount < MIN_SYMBOLS_AMOUNT)
        symbolsAmount = MIN_SYMBOLS_AMOUNT

    val digitRange = MIN_DIGIT..MAX_DIGIT
    val lowercaseLetterRange = MIN_LOWERCASE_LETTER..MAX_LOWERCASE_LETTER
    val uppercaseLetterRange = MIN_UPPERCASE_LETTER..MAX_UPPERCASE_LETTER
    val fullSymbolsList = digitRange + lowercaseLetterRange + uppercaseLetterRange

    val password = mutableListOf<Char>()
    password.add(digitRange.random())
    password.add(lowercaseLetterRange.random())
    password.add(uppercaseLetterRange.random())

    for (i in 1..symbolsAmount - RANGE_AMOUNT) {
        password.add(fullSymbolsList.random())
    }
    password.shuffle()
    println("Сгенерированный пароль: ${password.joinToString(separator = "")}")
}

const val MIN_SYMBOLS_AMOUNT = 6
const val RANGE_AMOUNT = 3
const val MIN_DIGIT = '0'
const val MAX_DIGIT = '9'
const val MIN_LOWERCASE_LETTER = 'a'
const val MAX_LOWERCASE_LETTER = 'z'
const val MIN_UPPERCASE_LETTER = 'A'
const val MAX_UPPERCASE_LETTER = 'Z'