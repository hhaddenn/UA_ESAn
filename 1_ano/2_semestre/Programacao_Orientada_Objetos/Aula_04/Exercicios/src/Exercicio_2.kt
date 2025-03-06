import kotlin.random.Random

fun main() {
    var carros = mutableListOf<Automovel>()
    val modelos = arrayListOf<String>("Opel", "Clio", "BMW", "Ferrari", "Porsche")

    for (i in 1..50) {
        val num = Random.nextInt(0, 1)
        when (num) {
            0 -> {
                carros.add(Automovel(
                    modelo = modelos[Random.nextInt(0, 5)],
                    litrosTanque = Random.nextDouble(1000.0, 1500.0),
                    litrosKm = Random.nextDouble(4.0, 7.0),
                ))
            }
            1 -> {
                carros.add(Economico(
                    modelo = modelos[Random.nextInt(0, 6)],
                    litrosTanque = Random.nextDouble(1000.0, 1500.0),
                    litrosKm = Random.nextDouble(4.0, 7.0),
                ))
            }
        }
    }
    for (c in carros) {
        c.litrosUtilizados(150.0)
    }
    for (c in carros) {
        println(c)
    }
}