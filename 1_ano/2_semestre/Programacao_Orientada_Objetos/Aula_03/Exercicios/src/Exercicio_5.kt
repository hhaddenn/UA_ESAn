fun main() {
    val entradaPao = Item("pao", 1.5)
    val entradaAzeitona = Item("azeitona", 2.5)
    val pratoCarne = Item("vitela", 25.0)
    val bebida = Item("agua", 1.0)
    val pratoPeixe = Item("bacalhau", 20.0)
    val sobremesa = Item("tiramissu", 2.0)


    val pedido1 = Pedido(1, mutableListOf<Item>(entradaPao, pratoCarne, bebida))
    val pedido2 = Pedido(2, mutableListOf<Item>(entradaAzeitona, pratoCarne, sobremesa))
    val pedido3 = Pedido(3, mutableListOf<Item>(entradaPao, pratoPeixe, bebida, sobremesa))

    for (pedido in arrayOf(pedido1, pedido2, pedido3)) {
        println("valor total do pedido ${pedido.identificador}: %.2f".format(pedido.valorFinal))
    }
}