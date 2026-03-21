package org.example.lesson_22_Data_class

fun main() {
    println("=== Деструктуризация ===")
    println()
    val user = User(name = "Mike", age = 30, sex = "male", isAdmin = true)
    val (name, age, sex, isAdmin) = user
    println("Имя: $name")
    println("Возраст: $age")
    println("Пол: $sex")
    println("Является администратором: $isAdmin")
}

data class User(
    val name: String,
    val age: Int,
    val sex: String,
    val isAdmin: Boolean,
)
