import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number1 = scanner.nextLong()
    val operation = scanner.next()
    val number2 = scanner.nextLong()

    println(when (operation) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "/" -> if (number2 == 0L) "Division by 0!" else number1 / number2
        "*" -> number1 * number2
        else -> "Unknown operator"
    })
}
