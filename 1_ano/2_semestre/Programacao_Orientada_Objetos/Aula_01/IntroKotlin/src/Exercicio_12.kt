fun main() {
    var idade50: Int = 0
    var mediaAlturas: Double = 0.0
    var totalAlturas: Int = 0
    var peso40: Double = 0.0
    var percentagemPeso40: Double = 0.0
    for (i in 1..12) {
        println()
        println("Pessoa $i")
        print("Escreva a idade: ")
        val idade: Int = readln().toInt()
        print("Escreva a altura em cm: ")
        val altura: Int = readln().toInt()
        print("Escreva o peso: ")
        val peso: Double = readln().toDouble()
        //Idades acima de 50
        if (idade > 50) {
            idade50 += 1
        }
        //Média de alturas com idade [10..20]
        if (idade in 10..20) {
            totalAlturas += 1
            mediaAlturas += altura
        }
        //Percentagem de pessoas com peso<40
        if (peso < 40) {
            peso40 += 1
        }
    }
    mediaAlturas /= totalAlturas
    percentagemPeso40 = (peso40 / 12) * 100
    println()
    println("Número de pessoas com idade>50: $idade50")
    println("A média de alturas das pessoas com idades entre 10 e 20: $mediaAlturas")
    println("Percentagem de pessoas com peso<40: $percentagemPeso40")
}