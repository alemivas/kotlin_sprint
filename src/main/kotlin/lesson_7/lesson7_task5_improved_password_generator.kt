package org.example.lesson_7

fun main() {
    println("=== Генератор паролей ===\n")
    println("Сколько символов должно быть в пароле? (минимальная длина пароля 6 символов)")
    var symbolsAmount = readln().toInt()
    if (symbolsAmount < 6)
        symbolsAmount = 6

    val digitRange = MIN_DIGIT..MAX_DIGIT
    val lowercaseLetterRange = MIN_LOWERCASE_LETTER..MAX_LOWERCASE_LETTER
    val uppercaseLetterRange = MIN_UPPERCASE_LETTER..MAX_UPPERCASE_LETTER
    val fullSymbolsList = digitRange + lowercaseLetterRange + uppercaseLetterRange

    var password = ""
    for (i in 1..symbolsAmount) {
        password += fullSymbolsList.random()
    }
    println("Сгенерированный пароль: $password")
}

const val MIN_DIGIT = '0'
const val MAX_DIGIT = '9'
const val MIN_LOWERCASE_LETTER = 'a'
const val MAX_LOWERCASE_LETTER = 'z'
const val MIN_UPPERCASE_LETTER = 'A'
const val MAX_UPPERCASE_LETTER = 'Z'