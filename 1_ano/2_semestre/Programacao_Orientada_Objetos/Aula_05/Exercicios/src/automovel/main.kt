package automovel

fun main() {

    val ligeiro1 = Ligeiro("aaa", 180.0)
    ligeiro1.movimentar(90.0)

    val bicicleta1 = Bicicleta(1)
    bicicleta1.movimentar(90.0)
    bicicleta1.trocarMarch(5)

    val automoveis = mutableListOf<Automovel>()
    automoveis.add(ligeiro1)
    automoveis.add(bicicleta1)

    for (automovel in automoveis) {
        automovel.movimentar(15.00)
    }
}