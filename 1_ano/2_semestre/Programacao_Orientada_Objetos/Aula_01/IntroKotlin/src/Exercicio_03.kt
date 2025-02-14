fun main() {
    var cotDolar: Double = 0.95
    var dolar: Double = 0.0
    var euro: Double = 0.0

    print("Digite a quantidade de dólares $: ")
    dolar = readln().toDouble()
    euro = dolar * cotDolar

    println("$dolar$ = $euro€")
}