package org.example.lesson_13

fun main() {
    println("=== Телефонный справочник ===")

    val user1 = UserWP(
        name = "Николай",
        phoneNumber = 8_999_555_44_88,
        company = "Озон",
    )
    user1.printInfo()

    val user2 = UserWP(
        name = "Полина",
        phoneNumber = 8_000_000_00_00,
        company = null,
    )
    user2.printInfo()
}

class UserWP(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println(
            "\n" +
            "- Имя: $name\n" +
            "- Телефон: $phoneNumber\n" +
            "- Компания: ${company ?: "<не указано>"}"
        )
    }
}