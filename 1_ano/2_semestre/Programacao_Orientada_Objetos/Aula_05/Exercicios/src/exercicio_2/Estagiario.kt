package exercicio_2

class Estagiario(
    override var horas: Int,
    override var salario: Double = 3.0
) : Pagamento {
    var pagamento: Double = 0.0
    override fun fazerPagamento(horas: Int) {
        pagamento = salario*horas
    }
}