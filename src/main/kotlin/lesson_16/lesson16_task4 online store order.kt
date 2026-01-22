package org.example.lesson_16

fun main() {
    println("=== Заказ в интернет-магазине ===")
    println()
    val order = Order(orderNumber = 5, orderStatus = OrderStatus.ORDER_PLACED)
    order.requestStatusChange(newStatus = OrderStatus.ORDER_SENT)
}

class Order(
    private val orderNumber: Int,
    private var orderStatus: OrderStatus,
) {
    init {
        println("Создан заказ № $orderNumber со статусом \"${orderStatus.value}\"")
    }

    private fun changeOrderStatus(newStatus: OrderStatus) {
        orderStatus = newStatus
        println("Статус заказа № $orderNumber изменен на \"${orderStatus.value}\"")
    }

    fun requestStatusChange(newStatus: OrderStatus) {
        println("Отправлена заявка менеджеру на смену статуса заказа № $orderNumber")
        println("Менеджер подтвердил смену статуса заказа № $orderNumber")
        changeOrderStatus(newStatus = newStatus)
    }
}

enum class OrderStatus(val value: String) {
    ORDER_PLACED("Заказ оформлен"),
    ORDER_SENT("Заказ отправлен"),
    ORDER_DELIVERED("Заказ доставлен"),
}
