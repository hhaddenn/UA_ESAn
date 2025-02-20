import kotlin.random.Random

fun main() {
    var arrayInteiro = Array<Int>(20) { Random.nextInt(0, 999)}
    println(arrayInteiro.contentToString())
}