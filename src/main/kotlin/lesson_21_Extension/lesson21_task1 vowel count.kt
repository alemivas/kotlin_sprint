package org.example.lesson_21_Extension

fun main() {
    println("=== Количество гласных букв ===")
    println()
    val hello = "Hello world! Hello Android!"
    println("Количество гласных в \"$hello\" = ${hello.vowelCount()}")
}

fun String.vowelCount(): Int {
    val vowels = "aeiouyAEIOUY"
    return count { it in vowels }
}
