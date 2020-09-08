package machine

import java.util.*

var water = 400
var milk = 540
var coffee = 120
var cups = 9
var money = 550

fun main() {

    val scanner = Scanner(System.`in`)
    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        when (scanner.next()) {
            "exit" -> return
            "remaining" -> {
                println()
                printStore()
            }
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                val result = when (scanner.next()) {
                    "1" -> when {
                        water - 250 < 0 -> {
                            println("Sorry, not enough water!")
                            false
                        }
                        coffee - 16 < 0 -> {
                            println("Sorry, not enough coffee beans!")
                            false
                        }
                        cups - 1 < 0 -> {
                            println("Sorry, not enough cups!")
                            false
                        }
                        else -> {
                            water -= 250
                            coffee -= 16
                            money += 4
                            cups -= 1
                            true
                        }
                    }
                    "2" -> when {
                        water - 350 < 0 -> {
                            println("Sorry, not enough water!")
                            false
                        }
                        milk - 75 < 0 -> {
                            println("Sorry, not enough milk!")
                            false
                        }
                        coffee - 20 < 0 -> {
                            println("Sorry, not enough coffee beans!")
                            false
                        }
                        cups - 1 < 0 -> {
                            println("Sorry, not enough cups!")
                            false
                        }
                        else -> {
                            water -= 350
                            milk -= 75
                            coffee -= 20
                            money += 7
                            cups -= 1
                            true
                        }
                    }
                    "3" -> when {
                        water - 200 < 0 -> {
                            println("Sorry, not enough water!")
                            false
                        }
                        milk - 100 < 0 -> {
                            println("Sorry, not enough milk!")
                            false
                        }
                        coffee - 12 < 0 -> {
                            println("Sorry, not enough coffee beans!")
                            false
                        }
                        cups - 1 < 0 -> {
                            println("Sorry, not enough cups!")
                            false
                        }
                        else -> {
                            water -= 200
                            milk -= 100
                            coffee -= 12
                            cups -= 1
                            money += 6
                            true
                        }
                    }
                    else -> false
                }
                if (result) {
                    println("I have enough resources, making you a coffee!")
                }
            }
            "fill" -> {
                println("Write how many ml of water do you want to add:")
                water += scanner.nextInt()
                println("Write how many ml of milk do you want to add:")
                milk += scanner.nextInt()
                println("Write how many grams of coffee beans do you want to add:")
                coffee += scanner.nextInt()
                println("Write how many disposable cups of coffee do you want to add:")
                cups += scanner.nextInt()
                println()
            }
            "take" -> {
                println("I gave you \$$money")
                money = 0
                println()
            }
        }
    }
}

fun printStore() {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$coffee of coffee beans")
    println("$cups of disposable cups")
    println("\$$money of money")
}
