package org.example.lesson_11

fun main() {
    println("=== Социальная сеть с голосовыми комнатами ===")
    val user1 = Participant(
        id = 1, name = "Bob", password = "123", email = "bob@gmail.com", avatar = "\uD83E\uDDD4\uD83C\uDFFB",
    )
    val user2 = Participant(
        id = 2, name = "Lisa", password = "111", email = "lisa@gmail.com", avatar = "\uD83D\uDC67",
    )
    val user3 = Participant(
        id = 3, name = "Mark", password = "333", email = "mark@gmail.com", avatar = "\uD83D\uDC68\u200D\uD83E\uDDB0",
    )
    val friendRoom = VoiceRoom(
        id = 1,
        label = "\uD83D\uDE04",
        name = "Друзья",
    )

    friendRoom.addUser(user1)
    friendRoom.addUser(user2)
    friendRoom.addUser(user3)
    friendRoom.updateStatus(user1.name, SpeakerStatus.MUTED)
    friendRoom.updateStatus(user2.name, SpeakerStatus.MICROPHONE_OFF)
    friendRoom.updateStatus(user3.name, SpeakerStatus.TALKING)

    friendRoom.printRoomInfo()
}

class Participant(
    val id: Int,
    val name: String,
    var password: String,
    val email: String,
    var bio: String = "",
    var avatar: String,
    var status: SpeakerStatus = SpeakerStatus.MICROPHONE_OFF,
) {}

class VoiceRoom(
    val id: Int,
    val label: String,
    val name: String,
    val userSet: MutableSet<Participant> = mutableSetOf(),
) {
    fun addUser(user: Participant) {
        if (userSet.add(user)) {
            println()
            println("Пользователь ${user.name} добавлен в комнату $name")
        }
    }

    fun updateStatus(name: String, status: SpeakerStatus) {
        val user = userSet.firstOrNull { it.name == name }
        if (user != null)
            user.status = status
    }

    fun printRoomInfo() {
        println()
        println("-".repeat(20))
        println(label)
        println(name)
        userSet.forEach { user ->
            println("${user.avatar}\t${user.status.value}")
        }
        println("-".repeat(20))
    }
}

enum class SpeakerStatus(val value: String) {
    TALKING("разговаривает"),
    MICROPHONE_OFF("микрофон выключен"),
    MUTED("пользователь заглушен"),
}