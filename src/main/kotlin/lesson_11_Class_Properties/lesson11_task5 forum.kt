package org.example.lesson_11

fun main() {
    println("=== Форум ===")

    val forum = Forum()
    val user0 = forum.createNewUser().setUserName("Вася").build()
    val user1 = forum.createNewUser().setUserName("Петя").build()
    forum.createNewMessage().setAuthorId(user0.userId).setMessage("Доброе утро!").build()
    forum.createNewMessage().setAuthorId(user1.userId).setMessage("Привет!").build()
    forum.createNewMessage().setAuthorId(user0.userId).setMessage("Как дела?").build()
    forum.createNewMessage().setAuthorId(user1.userId).setMessage("Хорошо").build()

    forum.printThread()
}

class Forum(
    val userList: MutableList<ForumUser> = mutableListOf(),
    val messageList: MutableList<ForumMessage> = mutableListOf(),
) {
    var userId = 0

    inner class UserBuilder {
        private var userName: String = ""

        fun setUserName(name: String) = apply { this.userName = name }

        fun build(): ForumUser {
            val user = ForumUser(
                userId = userId++,
                userName = userName,
            )
            userList.add(user)
            return user
        }
    }

    inner class MessageBuilder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(authorId: Int) = apply { this.authorId = authorId }
        fun setMessage(message: String) = apply { this.message = message }

        fun build(): ForumMessage? {
            if (userList.firstOrNull { it.userId == authorId } != null) {
                val forumMessage = ForumMessage(
                    authorId = authorId,
                    message = message,
                )
                messageList.add(forumMessage)
                return forumMessage
            } else {
                println()
                println("Пользователь с id $authorId не найден")
                return null
            }
        }
    }

    fun createNewUser(): UserBuilder {
        return UserBuilder()
    }

    fun createNewMessage(): MessageBuilder {
        return MessageBuilder()
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