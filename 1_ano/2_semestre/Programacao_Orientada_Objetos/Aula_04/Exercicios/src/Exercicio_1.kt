import kotlin.random.Random

fun main() {
    var animals = mutableListOf<Felino>()

    fun randomName(): String {
        var nome: String = ""
        for (i in 1..5) {
            val number = Random.nextInt(97, 122)
            nome += number.toChar()
        }
        return nome
    }

    fun randomPeso(): Double = Random.nextDouble(10.0, 500.0)

    for (i in 1..40) {
        val num = Random.nextInt(1,3)
        when (num) {
            0 -> {
                animals.add(Gato(randomName(), randomPeso()))
            }
            1 -> {
                animals.add(Leao(randomName(), randomPeso()))
            }
            2 -> {
                animals.add(Tigre(randomName(), randomPeso()))
            }
        }
    }
    for (animal in animals) {
        println(animal.information())
    }
}