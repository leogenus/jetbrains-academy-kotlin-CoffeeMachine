data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = if (-92 >= value || value >= 57) {
                this.default
            } else {
                value
            }
        }
    var default: Int = 0
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai").apply {
        degrees = first
        default = 30
    }
    val secondCity = City("Moscow").apply {
        degrees = second
        default = 5
    }
    val thirdCity = City("Hanoi").apply {
        degrees = third
        default = 20
    }
    val neither = City("neither")
    val city = if (firstCity.degrees < secondCity.degrees) {
        when {
            firstCity.degrees < thirdCity.degrees -> firstCity
            firstCity.degrees > thirdCity.degrees -> thirdCity
            else -> neither
        }
    } else {
        when {
            secondCity.degrees < thirdCity.degrees -> secondCity
            secondCity.degrees > thirdCity.degrees -> thirdCity
            else -> neither
        }
    }
    print(city.name)
}
