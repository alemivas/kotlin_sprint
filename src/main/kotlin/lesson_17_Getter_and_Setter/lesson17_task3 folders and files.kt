package org.example.lesson_17_Getter_and_Setter

fun main() {
    println("=== Папки и файлы ===")
    println()
    val hiddenFolder = Folder(name = "Личное", filesNumber = 5, isHidden = true)
    println("Имя папки: ${hiddenFolder.name}. Количество файлов: ${hiddenFolder.filesNumber}")
    val regularFolder = Folder(name = "Общее", filesNumber = 13, isHidden = false)
    println("Имя папки: ${regularFolder.name}. Количество файлов: ${regularFolder.filesNumber}")
}

class Folder(
    name: String,
    filesNumber: Int,
    private val isHidden: Boolean,
) {
    val name = name
        get() =
            if (isHidden) "Скрытая папка"
            else field

    val filesNumber = filesNumber
        get() =
            if (isHidden) 0
            else field
}
