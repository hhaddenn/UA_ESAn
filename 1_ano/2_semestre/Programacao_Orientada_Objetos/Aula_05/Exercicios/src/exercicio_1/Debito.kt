package exercicio_1

class Debito(
    override var taxa: Double,
) : Pagamento() {

    override var valorFinal: Double = 0.0
        get() = field

    override fun realizarPagamento(valor: Double): Double {
        valorFinal = aplicarTaxa(valor)
        return valorFinal
    }
}