package org.example.lesson_13

fun main() {
    println("=== Телефонный справочник ===")

    val phoneBook: List<Contact> = listOf(
        Contact(name = "Николай", phoneNumber = 8_999_555_44_77, company = null),
        Contact(name = "Алиса", phoneNumber = 8_999_555_44_00, company = "Yandex"),
        Contact(name = "Петр", phoneNumber = 8_999_111_44_77, company = null),
        Contact(name = "Евгений", phoneNumber = 8_999_000_44_77, company = "null"),
        Contact(name = "Гульнара", phoneNumber = 8_909_000_12_34, company = "Бахрома"),
    )

    val companyList = phoneBook.mapNotNull { it.company }.joinToString()
    println()
    println("Список всех компаний телефонной книги:")
    println(companyList)
}

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)