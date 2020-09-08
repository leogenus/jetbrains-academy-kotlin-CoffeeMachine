import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var number: Int? = null
    var sum = 0
    while (scanner.hasNext()) {
        number = scanner.nextInt()
        if (number == 0) break
        sum += number
    }
    println(sum)
}
