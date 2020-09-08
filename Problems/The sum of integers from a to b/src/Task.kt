import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val min = scanner.nextInt()
    val max = scanner.nextInt()
    var sum = 0
    for (index in min..max) {
        sum += index
    }
    println(sum)
}
