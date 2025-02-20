import kotlin.random.Random

fun main() {
    print("Escreva um número: ")
    var n: Int = readln().toInt()
    var arrayAleatorio= IntArray(n){Random.nextInt()}
    println(arrayAleatorio.contentToString())
}