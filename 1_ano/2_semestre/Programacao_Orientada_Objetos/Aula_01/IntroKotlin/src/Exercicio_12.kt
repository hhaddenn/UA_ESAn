fun main() {
    var pessoas = emptyMap<String, String>()
    for (i in 1..2) {
        println()
        println("Pessoa $i")
        print("Escreva a idade: ")
        val idade: Int = readln().toInt()
        pessoas.plus("idade" to idade)
        print("Escreva a altura em cm: ")
        val altura: Int = readln().toInt()
        pessoas.plus("alturas" to altura)
        print("Escreva o peso: ")
        val peso: Double = readln().toDouble()
        pessoas.plus("peso" to peso)
    }
    val mais50 = pessoas.filter {
        (key, value) -> key=="idade" && value.toInt()>50
    }
    println()
    println("Quantidade de pessoas que tem idade>50: $mais50")
}