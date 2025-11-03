package org.example.lesson_11

fun main() {
    println("=== Форум ===")
}

class Forum(
    val userList: MutableList<ForumUser>,
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