fun main() {
    print("Escreva a altura da pirâmide: ")
    val altura = readln().toInt()
    var espaco: Int = altura-1
    for (i in 1..altura ) {
        print(" ".repeat(espaco))
        print("*".repeat(i*2-1))
        print(" ".repeat(espaco))
        espaco -= 1
        println()
    }
}