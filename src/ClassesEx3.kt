import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

data class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("Maksym", "Kenny", "Eric", "Stan", "Kyle")
    fun generateEmployee() = Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}