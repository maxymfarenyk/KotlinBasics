class Employee1(val name: String, var salary: Int)

fun main() {
    val emp = Employee1("Mary", 20)
    println(emp.salary)
    emp.salary += 10
    println(emp.salary)
}