class Animal(private var nome: String = "", private var pernas: Int = 0, private var especie: String = "") {

    fun information() {
        println("Informação do Animal")
        println("Nome: $nome")
        println("Pernas: $pernas")
        println("Especie: $especie")
    }
}