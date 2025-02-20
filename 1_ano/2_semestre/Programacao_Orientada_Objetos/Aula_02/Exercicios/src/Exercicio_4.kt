import kotlin.random.Random

fun main() {
    val vetorA = Array<Int>(Random.nextInt(0,19)){ Random.nextInt(0,9) }
    val vetorB = Array<Int>(Random.nextInt(0,19)){ Random.nextInt(0,9) }
    println(vetorA.toList().intersect(vetorB.toList()))
}