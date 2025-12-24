package org.example.lesson_15

fun main() {
    println("=== грузовые и легковые автомобили ===")

    val audiCar = Cars(name = "легковой Audi", currentPassengerAmount = 3, currentCargoAmount = 0)
    val fordTruck = Trucks(name = "грузовой Ford", currentPassengerAmount = 1, currentCargoAmount = 1)
    val kamazTruck = Trucks(name = "грузовой Kamaz", currentPassengerAmount = 0, currentCargoAmount = 1)
    val nivaCar = Cars(name = "легковой Niva", currentPassengerAmount = 2, currentCargoAmount = 0)

    audiCar.loadCargo(maxCargoCapacity = 0, currentCargoAmount = 0)
    audiCar.loadPassenger(maxPassengerCapacity = 3, currentPassengerAmount = 3)
    audiCar.startAutomobile(name = "легковой Audi")
    audiCar.stopAutomobile(name = "легковой Audi")
    audiCar.unloadPassenger()
    audiCar.unloadCargo()
}

abstract class Automobile : Movement, PassengerTransportation, CargoTransportation {
    abstract val name: String
    abstract val maxPassengerCapacity: Int
    abstract val maxCargoCapacity: Int
    abstract val currentPassengerAmount: Int
    abstract val currentCargoAmount: Int
}

class Trucks(
    override val name: String,
    override val maxPassengerCapacity: Int = 1,
    override val maxCargoCapacity: Int = 2,
    override val currentPassengerAmount: Int,
    override val currentCargoAmount: Int,
) : Automobile() {
//    override fun startAutomobile() {
//        println("Грузовой автомобиль $name выехал")
//    }
//
//    override fun stopAutomobile() {
//        println("Грузовой автомобиль $name остановился")
//    }
}

class Cars(
    override val name: String,
    override val maxPassengerCapacity: Int = 3,
    override val maxCargoCapacity: Int = 0,
    override val currentPassengerAmount: Int,
    override val currentCargoAmount: Int
) : Automobile() {
//    override fun startAutomobile() {
//        println("Легковой автомобиль $name выехал")
//    }
//
//    override fun stopAutomobile() {
//        println("Легковой автомобиль $name остановился")
//    }
}

interface Movement {
    fun startAutomobile(name: String) {
        println("Автомобиль $name выехал")
    }
    fun stopAutomobile(name: String) {
        println("Автомобиль $name остановился")
    }
}

interface PassengerTransportation {
    fun loadPassenger(maxPassengerCapacity: Int, currentPassengerAmount: Int) {
        if (currentPassengerAmount > maxPassengerCapacity)
            println("В автомобиль сели $maxPassengerCapacity пассажиров")
        else
            println("В автомобиль сели $currentPassengerAmount пассажиров")
    }

    fun unloadPassenger() {
        println("Из автомобиля вышли пассажиры")
    }
}

interface CargoTransportation {
    fun loadCargo(maxCargoCapacity: Int, currentCargoAmount: Int) {
        if (currentCargoAmount > maxCargoCapacity)
            println("В автомобиль загружено $maxCargoCapacity т груза")
        else
            println("В автомобиль загружено $currentCargoAmount т груза")
    }

    fun unloadCargo() {
        println("Из автомобиля выгружен груз")
    }
}