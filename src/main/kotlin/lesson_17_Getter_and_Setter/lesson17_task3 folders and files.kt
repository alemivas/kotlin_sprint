package org.example.lesson_17_Getter_and_Setter

fun main() {
    println("=== Папки и файлы ===")
    println()
    val hiddenFolder = Folder(name = "Скрытая папка", filesNumber = 5, isHidden = true)
    println(hiddenFolder.name)
    val regularFolder = Folder(name = "Обычная папка", filesNumber = 13, isHidden = false)
    println(regularFolder.name)
}

class Folder(
    name: String,
    private val filesNumber: Int,
    private val isHidden: Boolean,
) {
    val name = name
        get() =
            if (isHidden) "Скрытая папка. Количество файлов – 0"
            else "$field. Количество файлов – $filesNumber"
}
