package org.example.lesson_13

fun main() {
    println("=== Телефонный справочник ===")
    val contactList = mutableListOf<ContactWM>()

    do {
        println()
        println("Введите имя")
        val name = readln()
        println("Введите номер телефона")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber != null) {
            println("Введите название компании")
            val company = readln().ifEmpty { null }
            val contact = ContactWM(
                name = name,
                phoneNumber = phoneNumber,
                company = company,
            )
            contactList.add(contact)
        } else {
            println("Введен не корректный номер телефона")
            println("Контакт не добавлен")
        }
        println("Добавить еще контакт? д/н")
        val isAddContact = readln() == "д"
    } while (isAddContact)

    println()
    println("Телефонная книга:")
    contactList.forEach { it.printContact() }
}

class ContactWM(
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