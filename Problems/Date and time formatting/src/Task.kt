import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val dateTimeText = scanner.nextLine()
    val dateTime = SimpleDateFormat("H m s d M y").parse(dateTimeText)
    println(SimpleDateFormat("H:m:s d/M/y").format(dateTime))
}
