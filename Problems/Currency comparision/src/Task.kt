import java.util.*

enum class Currency {
    EURO,
    CFA_FRANC,
    EASTERN_CARIBBEAN_DOLLAR,
    CANADIAN_DOLLAR,
    AUSTRALIAN_DOLLAR,
    BRAZILIAN_REAL
}

enum class Country(val title: String, val currency: Currency) {
    GERMANY("Germany", Currency.EURO),
    MALI("Mali", Currency.CFA_FRANC),
    DOMINICA("Dominica", Currency.EASTERN_CARIBBEAN_DOLLAR),
    CANADA("Canada", Currency.CANADIAN_DOLLAR),
    SPAIN("Spain", Currency.EURO),
    AUSTRALIA("Australia", Currency.AUSTRALIAN_DOLLAR),
    BRAZIL("Brazil", Currency.BRAZILIAN_REAL),
    SENEGAL("Senegal", Currency.CFA_FRANC),
    FRANCE("France", Currency.EURO),
    GRENADA("Grenada", Currency.EASTERN_CARIBBEAN_DOLLAR),
    KIRIBATI("Kiribati", Currency.AUSTRALIAN_DOLLAR);

    companion object {
        fun valueOfNullable(title: String): Country? {
            for (value in values()) {
                if (value.title == title) return value
            }
            return null
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val country1 = Country.valueOfNullable(input.next())
    val country2 = Country.valueOfNullable(input.next())
    if (country1 == null || country2 == null) {
        println(false)
    } else {
        println(country1.currency.name == country2.currency.name)
    }
}
