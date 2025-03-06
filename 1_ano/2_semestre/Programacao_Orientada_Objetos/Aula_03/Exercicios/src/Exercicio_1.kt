import Animal
import Homem
import Casa

fun main() {
    var cao = Animal(nome="Fenrir", pernas=4, especie="cao")
    cao.information()
    println()

    var pessoa = Homem(nome="Hadden", idade=23, nacionalidade="Português"  )
    pessoa.information()
    println()

    var casa = Casa(dono="Hadden", janelas=4, cor="Azul" )
    casa.information()
    println()
}