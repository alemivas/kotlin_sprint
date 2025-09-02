package org.example.lesson_5

fun main() {

    val registeredUserName = "Zaphod"
    val registeredUserPassword = "PanGalactic"

    println("Введите ваше имя")
    val enteredUserName = readln()

    if (enteredUserName != registeredUserName)
        println("Зарегистрируйтесь")
    else {
        println("Введите пароль")
        val enteredUserPassword = readln()

        if (enteredUserPassword != registeredUserPassword)
            println("Пароль не верный")
        else
            println("Пользователь \"$registeredUserName\", вам разрешено входить на борт корабля \"Heart of Gold\"")
    }

}