import kotlin.random.Random

fun main() {
    val arvore: Int = Random.nextInt(1, 101)
    var tentativas: Int = 0
    var resposta:Int = 0
    println("Um marciano chegou a uma floresta e se escondeu atrás de uma das 100 árvores quando viu um caçador.")
    while (tentativas < 5 && resposta != arvore) {
        println()
        tentativas++
        print("Dispara para uma árvore: ")
        resposta = readln().toInt()
        when {
            resposta<arvore -> {
                println("Marciano- Estou mais á direita")
                println("Tenta outra vez")
            }
            resposta>arvore -> {
                println("Marciano- Estou mais á esquerda")
                println("Tenta outra vez")
            }
            resposta==arvore -> {
                print("Acertou no marciano!")
            }
        }
    }
}