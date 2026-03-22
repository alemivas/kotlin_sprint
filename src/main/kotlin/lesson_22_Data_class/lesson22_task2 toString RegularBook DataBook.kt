package org.example.lesson_22_Data_class

fun main() {
    println("=== Сравнение вывода обычного класса и Data класса ===")
    println()
    val regularBook1 = RegularBookClass(name = "Евгений Онегин", author = "Пушкин")
    val dataBook1 = DataBookClass(name = "Евгений Онегин", author = "Пушкин")

//    Для вывода объекта переопределил метод toString(), иначе выводит название класса и хеш
    println(regularBook1)

//    Для вывода объекта в data-классе неявно переопределяется метод toString(), выводящий все поля data-класса
    println(dataBook1)
}

class RegularBookClass(
    val name: String,
    val author: String,
) {
    override fun toString(): String {
        return "RegularBookClass(name='$name', author='$author')"
    }
}

data class DataBookClass(
    val name: String,
    val author: String,
)
