fun main() {
    val button = "X"

    println(
        when {
            button == "A" -> "Yes"
            button == "B" -> "No"
            button == "X" -> "Menu"
            button == "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}