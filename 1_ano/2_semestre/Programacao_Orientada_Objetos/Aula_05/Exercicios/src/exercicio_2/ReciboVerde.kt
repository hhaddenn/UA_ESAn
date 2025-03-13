package exercicio_2

class ReciboVerde (
    override var horas: Int,
    override var salario: Double = 10.0
) : Pagamento {
    var pagamento: Double = 0.0
    override fun fazerPagamento(horas: Int) {
        pagamento = salario*horas
    }
}