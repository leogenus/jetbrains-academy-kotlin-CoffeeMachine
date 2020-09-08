import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var amount = scanner.nextLine().trim().toInt()
    val cheques = scanner.nextLine().trim().split(" ").map { it.trim().toInt() }
    for (item in cheques) {
        if (amount - item < 0) {
            println("Error, insufficient funds for the purchase. You have $amount, but you need $item.")
            return
        }
        amount -= item
    }
    println("Thank you for choosing us to manage your account! You have $amount money.")
}
