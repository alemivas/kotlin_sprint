package lesson_18_Polymorphism

fun main() {
    println("=== Заказы в интернет магазине ===")
    println()
    val order1 = Order(orderNumber = 1)
    order1.addProducts(products = "Брюки")
    println()
    val order2 = Order(orderNumber = 2)
    order2.addProducts(products = listOf("Шляпа", "Кроссовки", "Носки"))
}

class Order(
    private val orderNumber: Int,
) {
    fun addProducts(products: String) {
        println("Заказ №$orderNumber. Заказан товар: $products")
    }

    fun addProducts(products: List<String>) {
        println("Заказ №$orderNumber. Заказаны следующие товары: ${products.joinToString()}")
    }
}
