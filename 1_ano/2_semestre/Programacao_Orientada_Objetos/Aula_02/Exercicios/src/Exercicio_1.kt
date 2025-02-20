fun main() {
    var arrayValor = DoubleArray(10)
    var media: Double = 0.0
    for (i in 1..10) {
        print("Escreva o valor $i: ")
        arrayValor[i-1] = readln().toDouble()
        media += arrayValor[i-1]
    }
    media /= 10
    println("Valores abaixo da média:")
    for (i in arrayValor) {
        if (i <= media) {
            println("$i ")
        }
    }
}