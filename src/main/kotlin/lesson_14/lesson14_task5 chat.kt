package org.example.lesson_14

fun main() {
    println("=== Чат ===")
    val chat = Chat()
    chat.addMessage(text = "0 сообщение", author = "aaa")
    chat.addMessage(text = "1 сообщение", author = "bbb")
    chat.addThreadMessage(text = "0 ответ на сообщение1", author = "ddd", parentMessageId = 1)
    chat.addMessage(text = "2 сообщение", author = "ccc")
    chat.addThreadMessage(text = "1 ответ на сообщение1", author = "bbb", parentMessageId = 1)
    chat.addThreadMessage(text = "0 ответ на сообщение0", author = "bbb", parentMessageId = 0)
    chat.addThreadMessage(text = "0 ответ на сообщение2", author = "ddd", parentMessageId = 3)
    chat.addThreadMessage(text = "2 ответ на сообщение1", author = "aaa", parentMessageId = 1)

    chat.printChat()
}

class Chat(
    private val messageList: MutableList<Message> = mutableListOf(),
) {
    private var id = 0

    fun addMessage(
        text: String,
        author: String,
    ) {
        messageList.add(Message(text = text, author = author, id = id++))
    }

    fun addThreadMessage(
        text: String,
        author: String,
        parentMessageId: Int,
    ) {
        messageList.add(ChildMessage(text = text, author = author, id = id++, parentMessageId = parentMessageId))
    }

    fun printChat() {
        println()
        val groupedMessageMap = messageList.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
        groupedMessageMap.forEach { messageGroup ->
            messageGroup.value.forEach { message ->
                println("${if (message is ChildMessage) "\t" else ""}${message.author}: ${message.text}")
            }
        }
    }
}

open class Message(
    val text: String,
    val author: String,
    val id: Int,
)

class ChildMessage(
    text: String,
    author: String,
    id: Int,
    val parentMessageId: Int,
) : Message(text, author, id)