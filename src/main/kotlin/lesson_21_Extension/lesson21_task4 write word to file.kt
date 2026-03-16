package org.example.lesson_21_Extension

import java.io.File

fun main() {
    println("=== Запись слова в начало файла ===")
    println()
    val file = File("text.txt")
    file.createNewFile()
    file.prependText("dfGgsUIdgdg")
    file.prependText("Ttttttt")
    file.prependText("uUuUuUuU")
}

fun File.prependText(word: String) {
    val lowercaseWord = word.lowercase()
    val text = readText()
    writeText(lowercaseWord + "\n" + text)
}
