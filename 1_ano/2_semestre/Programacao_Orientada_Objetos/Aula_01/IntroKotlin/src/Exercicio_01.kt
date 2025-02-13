fun main() {
    var desconto: Double = 0.0

    print("Escreva o valor: ")
    val valor:Int = readln().toInt()

    val total:Int = (valor/100)
    desconto = valor * total * 0.0005
    println("Valor do desconto: $desconto")
}