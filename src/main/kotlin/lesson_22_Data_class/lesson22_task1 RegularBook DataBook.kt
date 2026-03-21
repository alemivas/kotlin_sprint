package org.example.lesson_22_Data_class

fun main() {
    println("=== Сравнение обычного класса и Data класса ===")
    println()
    val regularBook1 = RegularBook(name = "Евгений Онегин", author = "Пушкин")
    val regularBook2 = RegularBook(name = "Евгений Онегин", author = "Пушкин")
    val dataBook1 = DataBook(name = "Евгений Онегин", author = "Пушкин")
    val dataBook2 = DataBook(name = "Евгений Онегин", author = "Пушкин")

//    Сравнение ссылок на разные объекты с одинаковыми свойствами, поэтому результат false
    println(regularBook1 == regularBook2)

//    Сравнение значений свойств разных объектов с одинаковыми свойствами, поэтому результат true
    println(dataBook1 == dataBook2)
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
