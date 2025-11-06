package org.example.lesson_11

fun main() {
    println("=== Форум ===")

    val forum = Forum()

    forum.createNewUser(name = "Вася")
    forum.createNewUser(name = "Петя")

    forum.createNewMessage(userId = 1)
    forum.createNewMessage(userId = 1)

    forum.printThread()
}

class Forum(
    val userList: MutableList<ForumUser> = mutableListOf(),
) {
    fun createNewUser(name: String): ForumUser {
        val user = ForumUser(
            userId = 1,
            userName = name,
        )
        userList.add(user)
        return user
    }

    fun createNewMessage(userId: Int) {
        if (userList.firstOrNull { it.userId == userId } != null) {
            val message = ForumMessage(
                authorId = userId,
                message = ""
            )
        }
    }

    fun printThread() {
        userList.forEach { user ->
            user.messageList.forEach { message ->
                println("${user.userName}: ${message.message}")
            }
        }
    }
}

class ForumUser(
    val userId: Int,
    val userName: String,
    val messageList: MutableList<ForumMessage> = mutableListOf(),
) {}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {}