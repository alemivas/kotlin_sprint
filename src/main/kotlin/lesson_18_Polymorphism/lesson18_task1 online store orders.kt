package lesson_18_Polymorphism

fun main() {
    println("=== Заказы в интернет магазине ===")
    println()
    val order1 = Order()
    order1.addOrder(orderNumber = 1, products = "Брюки")
    println()
    val order2 = Order()
    order2.addOrder(orderNumber = 2, products = listOf("Шляпа", "Кроссовки", "Носки"))
}

class Order {
    fun addOrder(
        orderNumber: Int,
        products: String,
    ) {
        println("Заказ №$orderNumber. Заказан товар: $products")
    }
    fun addOrder(
        orderNumber: Int,
        products: List<String>,
    ) {
        println("Заказ №$orderNumber. Заказаны следующие товары: ${products.joinToString()}")
    }
}
