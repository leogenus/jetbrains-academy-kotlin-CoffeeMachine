data class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        fun create(name: String): Player = Player(0, name, 100)
    }
}
