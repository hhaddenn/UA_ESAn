class Homem(private var nome: String="", private var idade: Int=0, private var nacionalidade: String="", private var especie: String="") {

    fun information() {
        println("Informação Homem")
        println("Nome: $nome")
        println("Idade: $idade")
        println("Nacionalidade: $nacionalidade")
    }
}