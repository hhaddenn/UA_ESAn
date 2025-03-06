class Pedido(val identificador: Int, val itens: MutableList<Item>) {
    fun valorFinal(): Double = itens.sumOf {item -> item.valorFinal}

    val valorFinal:Double
        get() {
            var soma: Double = 0.0
            for (item in itens) soma += item.valorFinal
            return soma
        }
}