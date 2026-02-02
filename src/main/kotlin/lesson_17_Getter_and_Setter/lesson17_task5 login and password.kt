package org.example.lesson_17_Getter_and_Setter

fun main() {
    println("=== Логин и пароль ===")
    println()
    val user = User(login = "Александр", password = "77")
    user.login = "Alex"
    user.password = "123123"
    println("Логин: ${user.login}")
    println("Пароль: ${user.password}")
}

class User(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            println("Логин успешно заменен с $field на $value")
            field = value
        }

    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}
