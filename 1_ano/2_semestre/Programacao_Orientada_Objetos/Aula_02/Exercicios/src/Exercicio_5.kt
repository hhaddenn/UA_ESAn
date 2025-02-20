import kotlin.random.Random

fun main() {
    var media: Double = 0.0
    var sumatorio: Int = 0
    val vetor = Array<Int>(Random.nextInt(0,19)) { Random.nextInt(0,99) }
    sumatorio += vetor.sum()
    media = vetor.average()
    println("Sumatório: $sumatorio")
    println("Média: $media")
}