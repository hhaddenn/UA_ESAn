fun main() {
    print("Escreva o primeiro número: ")
    val n1: Int = readln().toInt()
    print("Escreva o segundo número: ")
    val n2: Int = readln().toInt()
    var sum: Int = 0
    for (i in n1+1..n2-1){
        sum += i
    }
    println("O sumatório dos números [$n1; $n2] = $sum")
}