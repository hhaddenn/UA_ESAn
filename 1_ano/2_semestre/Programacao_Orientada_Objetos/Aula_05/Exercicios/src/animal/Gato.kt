package animal

class Gato(override var nome: String, override var peso: Double): Animal(nome, peso) {
    override fun fazerBarulho(): String {
        return "miau"
    }
}