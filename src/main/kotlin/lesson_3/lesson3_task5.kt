package org.example.lesson_3

fun main() {

    val move = "D2-D4;0"

    val (from, to, moveNumber) = move.split(";", "-")

    println("откуда: $from")
    println("куда: $to")
    println("номер хода: $moveNumber")

}