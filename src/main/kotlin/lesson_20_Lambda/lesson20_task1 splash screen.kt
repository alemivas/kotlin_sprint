package org.example.lesson_20_Lambda

fun main() {
    println("=== SplashScreen ===")
    println()
    val greeting: (username: String) -> String =
        { username -> "С наступающим Новым Годом, $username!" }
    println(greeting("Александр"))
}
