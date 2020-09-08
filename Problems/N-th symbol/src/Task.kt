import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    val symbol = scanner.nextInt()
    println("Symbol # $symbol of the string \"$text\" is '${text[symbol - 1]}'")
}
