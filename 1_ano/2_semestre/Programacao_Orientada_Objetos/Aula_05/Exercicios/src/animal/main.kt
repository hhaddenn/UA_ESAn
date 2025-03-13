package animal

fun main() {
    val gato1 = Gato("Binks", 5.3)
    println(gato1.fazerBarulho())
    println(gato1)

    val cao1 = Cao("Chewie", 25.7)
    println(cao1.fazerBarulho())
    println(cao1)
}