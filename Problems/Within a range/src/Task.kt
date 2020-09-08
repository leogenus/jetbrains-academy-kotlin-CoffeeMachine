import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val v1 = scanner.nextInt()
    val v2 = scanner.nextInt()
    val v3 = scanner.nextInt()
    val v4 = scanner.nextInt()
    val v5 = scanner.nextInt()
    println(v5 in v1..v2 || v5 in v3..v4)
}
