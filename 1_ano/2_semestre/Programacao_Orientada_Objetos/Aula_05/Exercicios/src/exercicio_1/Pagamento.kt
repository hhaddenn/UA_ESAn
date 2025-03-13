package exercicio_1

abstract class Pagamento {

    abstract var taxa: Double
    abstract var valorFinal: Double

    abstract open fun realizarPagamento(valor: Double) : Double
    open fun aplicarTaxa(valor: Double): Double {
        return valor + taxa*valor
    }
}