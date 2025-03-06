open class Felino(
    var nome: String = "",
    var peso: Double = 0.0
) {
    open val domestico: Boolean
        get() = false

    fun information () {
        println("Animal")
        println("$nome, $peso")
    }
}