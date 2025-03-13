package exercicio_1

import kotlin.random.Random


fun main() {
    var pagamentos = mutableSetOf<Pagamento>()
    for (i in 1..500) {
        var j = Random.nextInt(0, 4)
        when (j) {
            0 -> {
                pagamentos.add(Credito(taxa = 0.23))
            }
            1 -> {
                pagamentos.add(Debito(taxa = 0.23))
            }
            2 -> {
                pagamentos.add(MbWay(taxa = 0.23))
            }
            3 -> {
                pagamentos.add(PayPal(taxa = 0.23))
            }
        }
    }
    pagamentos.forEach {pagamento ->
        pagamento.realizarPagamento(Random.nextDouble(10.0, 500.0))
    }
    var totalCredito: Double = 0.0
    var totalDebito: Double = 0.0
    var totalMbWay: Double = 0.0
    var totalPayPal: Double = 0.0
    println("Credito: ${pagamentos.filter{ p -> p is Credito }
        .sumOf{pg -> pg.valorFinal}/pagamentos.filter{p -> p is Credito}.size}")
    println("Debito: ${pagamentos.filter{ p -> p is Debito }
        .sumOf{pg -> pg.valorFinal}/pagamentos.filter{p -> p is Debito}.size}}")
    println("MbWay: ${pagamentos.filter{ p -> p is MbWay }
        .sumOf{pg -> pg.valorFinal}/pagamentos.filter{p -> p is MbWay}.size}}")
    println("PayPal: ${pagamentos.filter{ p -> p is PayPal }
        .sumOf{pg -> pg.valorFinal}/pagamentos.filter{p -> p is PayPal}.size}}")
}