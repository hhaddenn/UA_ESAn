package exercicio_2

import kotlin.random.Random

fun main() {
    var contratados = mutableListOf<Contratado>()
    var estagiarios = mutableListOf<Estagiario>()
    var recibos = mutableListOf<ReciboVerde>()
    val setores = hashMapOf<String, MutableList<Pagamento>>()

    for (i in 1..10){
        contratados.add(Contratado(Random.nextInt(100,200)))
        estagiarios.add(Estagiario(Random.nextInt(100,200)))
        recibos.add(ReciboVerde(Random.nextInt(100,200)))
    }

    contratados.forEach {p -> p.fazerPagamento(p.horas)}
    estagiarios.forEach {p -> p.fazerPagamento(p.horas)}
    recibos.forEach {p -> p.fazerPagamento(p.horas)}
    println("Contratado")
    println(contratados.forEach {p -> print("${p.pagamento} ")})
    println("Estagiarios")
    println(estagiarios.forEach {p -> print("${p.pagamento} ")})
    println("Recibos Verde")
    println(recibos.forEach {p -> print("${p.pagamento} ")})
}