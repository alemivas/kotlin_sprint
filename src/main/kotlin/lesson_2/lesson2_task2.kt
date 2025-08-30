package org.example.lesson_2

fun main() {

    val numberOfPermanentEmployees: Byte = 50
    val permanentEmployeeSalary: Short = 30_000

    val numberOfIntern: Byte = 30
    val internSalary: Short = 20_000

    val permanentEmployeeSalaryExpenses: Int = numberOfPermanentEmployees * permanentEmployeeSalary
    val internSalaryExpenses: Int = numberOfIntern * internSalary
    val totalSalaryExpenses: Int = permanentEmployeeSalaryExpenses + internSalaryExpenses
    val totalNumberOfEmployee: Byte = (numberOfPermanentEmployees + numberOfIntern).toByte()
    val averageSalary: Int = totalSalaryExpenses / totalNumberOfEmployee

    println("Расходы на выплату зарплаты постоянных сотрудников: $permanentEmployeeSalaryExpenses")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")

}