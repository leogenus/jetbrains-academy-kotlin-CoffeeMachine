class Application(private val name: String) {

    fun run(title: String, subtitle: String, content: String) {
        println(this.name)
        println(title)
        println(subtitle)
        println(content)
    }
}
