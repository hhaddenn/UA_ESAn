package exercicio_2

interface Pagamento {
    var horas: Int
    var salario: Double

    fun fazerPagamento(horas: Int)
}