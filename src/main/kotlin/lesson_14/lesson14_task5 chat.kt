package org.example.lesson_14

fun main() {
    println("=== Чат ===")

    val chat = Chat()
//    val chat: Chat

    chat.addMessage(text = "drtdfhd", author = "aaa")
    chat.addMessage(text = "yurtdjd", author = "bbb")
    chat.addThreadMessage(text = "sgsfdg", author = "ddd", parentMessageId = 1)
    chat.addThreadMessage(text = "fxgjhf", author = "aaa", parentMessageId = 1)
    chat.addMessage(text = "iuouioluil", author = "ccc")
    chat.addThreadMessage(text = "poop", author = "bbb", parentMessageId = 1)

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
        messageList.add(ChildMessage(text = text, author = author, id = id++, parentMessageId = parentMessageId))
    }

    fun printChat() {
        println()
//        messageList.forEach { println("${if (it is ChildMessage) "\t" else ""}${it.author}: ${it.text}") }
        messageList.forEach { println("${if (it is ChildMessage) "\t" else ""}${it.author}: ${it.text}") }
        println()
//        println(messageList.groupBy { if (it is ChildMessage) it.parentMessageId else it.id })
        val list = messageList.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
        list.forEach { it.value.forEach { println("${if (it is ChildMessage) "\t" else ""}${it.author}: ${it.text}") } }
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