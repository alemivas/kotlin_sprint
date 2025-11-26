package org.example.lesson_13

fun main() {
    println("=== Телефонный справочник ===")
    println()
    println("Введите имя")
    val name = readln()
    try {
        println("Введите номер телефона")
        val phoneNumber = readln().toLong()
        println("Введите название компании")
        val company = readln().ifEmpty { null }
        val contact = Contact5(
            name = name,
            phoneNumber = phoneNumber,
            company = company,
        )
        contact.printContact()
    } catch (e: Exception) {
        println("Произошла ошибка: $e")
    }
}

class Contact5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println(
            "\n" +
            "- Имя:\t$name\n" +
            "- Телефон:\t$phoneNumber\n" +
            "- Компания:\t${company ?: "<не указано>"}"
        )
    }
}