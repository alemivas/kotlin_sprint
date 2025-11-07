package org.example.lesson_11

fun main() {
    println("=== Форум ===")

    val forum = Forum()

    forum.createNewUser(name = "Вася")
    forum.createNewUser(name = "Петя")

    forum.createNewMessage(userId = 0, message = "Доброе утро!")
    forum.createNewMessage(userId = 1, message = "Привет!")
    forum.createNewMessage(userId = 0, message = "Как дела?")
    forum.createNewMessage(userId = 1, message = "Хорошо")

    forum.printThread()
}

class Forum(
    val userList: MutableList<ForumUser> = mutableListOf(),
    val messageList: MutableList<ForumMessage> = mutableListOf(),
) {
    var userId = 0

    fun createNewUser(name: String): ForumUser {
        val user = ForumUser(
            userId = userId++,
            userName = name,
        )
        userList.add(user)
        return user
    }

    fun createNewMessage(userId: Int, message: String) {
        if (userList.firstOrNull { it.userId == userId } != null) {
            val forumMessage = ForumMessage(
                authorId = userId,
                message = message,
            )
            messageList.add(forumMessage)
        }
    }

    fun printThread() {
        println()
        messageList.forEach { forumMessage ->
            val authorId = forumMessage.authorId
            val user = userList.first { it.userId == authorId }
            println("${user.userName}: ${forumMessage.message}")
        }
    }
}

class ForumUser(
    val userId: Int,
    val userName: String,
) {}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {}