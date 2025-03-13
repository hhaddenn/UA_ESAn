package animal

class Cao(override var nome : String, override var peso: Double): Animal(nome, peso) {
    override fun fazerBarulho(): String = "woof"

    override fun toString(): String {
        return super.toString() + " | Cão"
    }
}