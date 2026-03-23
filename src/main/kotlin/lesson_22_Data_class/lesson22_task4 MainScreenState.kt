package org.example.lesson_22_Data_class

fun main() {
    println("=== MainScreenState ===")
    println()
    val mainScreenViewModel = MainScreenViewModel(MainScreenState())
    mainScreenViewModel.loadData()
}

class MainScreenViewModel(
    private var mainScreenState: MainScreenState
) {
    fun loadData() {
        println("Отсутствие данных. $mainScreenState")
        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Загрузка данных. $mainScreenState")
        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy(data = "Привет, Kotlin!", isLoading = false)
        println("Данные загружены. $mainScreenState")
    }
}

data class MainScreenState(
    private var data: String? = null,
    private var isLoading: Boolean = false,
)
