package org.example.lesson_17_Getter_and_Setter

fun main() {
    println("=== Отправка и перемещение посылки ===")
    println()
    val pkg = Package(packageNumber = 123, currentLocation = "Москва")
    pkg.currentLocation = "Екатеринбург"
    pkg.currentLocation = "Челябинск"
}

class Package(
    private val packageNumber: Int,
    currentLocation: String,
) {
    private var movementCounter: Int = 0

    init {
        println("Создана посылка № $packageNumber. " +
                "Отправлена из $currentLocation. " +
                "Счетчик перемещений = $movementCounter")
    }

    var currentLocation = currentLocation
        set(value) {
            field = value
            movementCounter++
            println("Посылка № $packageNumber прибыла в $field. " +
                    "Счетчик перемещений = $movementCounter")
        }
}
