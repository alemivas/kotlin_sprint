package org.example.lesson_15

fun main() {
    println("=== Форум с обычными пользователями и админами ===")

    println()
    val user = User(id = 0, name = "Bob")
    user.readForum()
    user.writeMessage()

    println()
    val admin = Admin(id = 1, name = "Mike")
    admin.readForum()
    admin.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}

abstract class ForumMember {
    abstract val id: Int
    abstract val name: String

    abstract fun readForum()
    abstract fun writeMessage()
}

class User(
    override val id: Int,
    override val name: String
) : ForumMember() {
    override fun readForum() {
        println("Пользователь читает сообщения")
    }

    override fun writeMessage() {
        println("Пользователь пишет сообщение")
    }
}

class Admin(
    override val id: Int,
    override val name: String
) : ForumMember() {
    override fun readForum() {
        println("Администратор читает сообщения")
    }

    override fun writeMessage() {
        println("Администратор пишет сообщение")
    }

    fun deleteMessage() {
        println("Администратор удаляет сообщение")
    }

    fun deleteUser() {
        println("Администратор удаляет пользователя")
    }
}