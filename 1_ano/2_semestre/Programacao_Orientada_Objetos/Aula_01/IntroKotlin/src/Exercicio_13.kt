fun main() {
    var natA: Int = 5000000
    var natB: Int = 7000000
    var anos: Int = 0
    while (natA < natB) {
        anos += 1
        natA += (natA * 0.03).toInt()
        natB += (natB * 0.02).toInt()
    }
    println("São precisos $anos para o país A ter maior população do que B")
    println("Habitantes A: $natA")
    println("Habitantes B: $natB")
}