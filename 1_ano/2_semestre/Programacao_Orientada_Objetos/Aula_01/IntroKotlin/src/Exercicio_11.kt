fun main() {
    val dado1 = arrayOf(1, 2, 3, 4, 5, 6)
    val dado2 = arrayOf(1, 2, 3, 4, 5, 6)
    var probabilidade = emptyArray<String>()
    for (n1 in dado1) {
        for (n2 in dado2) {
            if (n1 + n2 == 7) {
                probabilidade += "dado 1:$n1, dado 2:$n2"
            }
        }
        for (n2 in dado2.reversedArray()) {
            if (n1 + n2 == 7) {
                probabilidade += "dado 2:$n2, dado 1:$n1"
            }
        }
    }
    for (n in probabilidade) {
        println(n)
    }
}