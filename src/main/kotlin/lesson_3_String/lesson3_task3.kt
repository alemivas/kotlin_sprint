package org.example.lesson_3

fun main() {

    val number = 6
    var i = 1

    println("""
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i++}
        $number x ${i} = ${number*i}
    """.trimIndent())
}
