package org.example.lesson_15

fun main() {
    println("=== грузовые и легковые автомобили ===")

    var transportedPassengerAmount = 0
    var transportedCargoAmount = 0
    val audiCar = Car(name = "легковой Audi")
    val fordTruck = Truck(name = "грузовой Ford")
    val kamazTruck = Truck(name = "грузовой Kamaz")
    val nivaCar = Car(name = "легковой Niva")

    println()
    audiCar.loadCargo(desiredCargoAmount = 1)
    transportedPassengerAmount += audiCar.loadPassenger(desiredPassengerAmount = 2)
    transportedPassengerAmount += audiCar.loadPassenger(desiredPassengerAmount = 2)
    transportedPassengerAmount += audiCar.loadPassenger(desiredPassengerAmount = 2)
    audiCar.startAutomobile()
    audiCar.arriveAutomobile()
    audiCar.unloadPassenger()
    audiCar.unloadCargo()

    println()
    transportedCargoAmount += fordTruck.loadCargo(desiredCargoAmount = 1)
    transportedPassengerAmount += fordTruck.loadPassenger(desiredPassengerAmount = 2)
    fordTruck.startAutomobile()
    fordTruck.arriveAutomobile()
    fordTruck.unloadPassenger()
    fordTruck.unloadCargo()

    println()
    transportedCargoAmount += kamazTruck.loadCargo(desiredCargoAmount = 1)
    transportedPassengerAmount += kamazTruck.loadPassenger(desiredPassengerAmount = 0)
    kamazTruck.startAutomobile()
    kamazTruck.arriveAutomobile()
    kamazTruck.unloadPassenger()
    kamazTruck.unloadCargo()

    println()
    nivaCar.loadCargo(desiredCargoAmount = 1)
    transportedPassengerAmount += nivaCar.loadPassenger(desiredPassengerAmount = 2)
    nivaCar.startAutomobile()
    nivaCar.arriveAutomobile()
    nivaCar.unloadPassenger()
    nivaCar.unloadCargo()

    println()
    println("Всего перевезено $transportedPassengerAmount человек")
    println("Всего перевезено $transportedCargoAmount т груза")
}

abstract class Automobile : Movement, PassengerTransportation, CargoTransportation {
    abstract override val name: String
    abstract override val maxPassengerCapacity: Int
    abstract override val maxCargoCapacity: Int
    abstract override var currentPassengerAmount: Int
    abstract override var currentCargoAmount: Int
}

class Truck(
    override val name: String,
    override val maxPassengerCapacity: Int = 1,
    override val maxCargoCapacity: Int = 2,
    override var currentPassengerAmount: Int = 0,
    override var currentCargoAmount: Int = 0,
) : Automobile()

class Car(
    override val name: String,
    override val maxPassengerCapacity: Int = 3,
    override val maxCargoCapacity: Int = 0,
    override var currentPassengerAmount: Int = 0,
    override var currentCargoAmount: Int = 0,
) : Automobile()

interface Movement {
    val name: String

    fun startAutomobile() {
        println("$name выехал")
    }

    fun arriveAutomobile() {
        println("$name приехал")
    }
}

interface PassengerTransportation {
    val name: String
    val maxPassengerCapacity: Int
    var currentPassengerAmount: Int

    fun loadPassenger(desiredPassengerAmount: Int): Int {
        val boardingPassengerAmount: Int
        if (currentPassengerAmount + desiredPassengerAmount > maxPassengerCapacity) {
            boardingPassengerAmount = maxPassengerCapacity - currentPassengerAmount
            currentPassengerAmount = maxPassengerCapacity
        } else {
            boardingPassengerAmount = desiredPassengerAmount
            currentPassengerAmount += desiredPassengerAmount
        }
        println(
            "В $name сели $boardingPassengerAmount пассажиров (из $desiredPassengerAmount). " +
            "Всего $currentPassengerAmount пассажиров"
        )
        return boardingPassengerAmount
    }

    fun unloadPassenger() {
        currentPassengerAmount = 0
        println("Из $name вышли все пассажиры")
    }
}

interface CargoTransportation {
    val name: String
    val maxCargoCapacity: Int
    var currentCargoAmount: Int

    fun loadCargo(desiredCargoAmount: Int): Int {
        val loadedCargoAmount: Int
        if (currentCargoAmount + desiredCargoAmount > maxCargoCapacity) {
            loadedCargoAmount = maxCargoCapacity - currentCargoAmount
            currentCargoAmount = maxCargoCapacity
        } else {
            loadedCargoAmount = desiredCargoAmount
            currentCargoAmount += desiredCargoAmount
        }
        println(
            "В $name загрузили $loadedCargoAmount т груза (из $desiredCargoAmount). " +
            "Всего $currentCargoAmount т груза"
        )
        return loadedCargoAmount
    }

    fun unloadCargo() {
        currentCargoAmount = 0
        println("Из $name выгрузили весь груз")
    }
}