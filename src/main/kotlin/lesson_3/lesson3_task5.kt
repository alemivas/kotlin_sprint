package org.example.lesson_3

fun main() {

    val move = "D2-D4;0"

    val from = move.substring(0, 2)
    val to = move.substring(3, 5)
    val moveNumber = move.substring(6)

    println("откуда: $from")
    println("куда: $to")
    println("номер хода: $moveNumber")

}