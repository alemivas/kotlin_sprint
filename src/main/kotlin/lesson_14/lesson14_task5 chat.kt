package org.example.lesson_14

fun main() {
    println("=== Чат ===")

    val chat = Chat()
//    val chat: Chat

    chat.addMessage(text = "drtdfhd", author = "aaa")
    chat.addMessage(text = "yurtdjd", author = "bbb")
//    chat.addThreadMessage()
    chat.addMessage(text = "iuouioluil", author = "ccc")

    chat.printChat()
}

class Chat(
//    /*private*/ val messageList: MutableList<Message>,
    val messageList: MutableList<Message> = mutableListOf(),
) {
    /*private*/ var id = 0

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

    }

    fun printChat() {
        println()
        messageList.forEach { println("${it.author}: ${it.text}") }
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