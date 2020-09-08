import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()
    println(when (line) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    })
}
