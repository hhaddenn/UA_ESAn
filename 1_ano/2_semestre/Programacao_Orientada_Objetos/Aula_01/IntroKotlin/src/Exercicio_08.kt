fun main() {
    var opcao: Int = 0
    while (opcao != 9) {
        println()
        println("--------------------------")
        println("|Conversão               |")
        println("|1 Celsius -> Fahrenheit |")
        println("|2 Fahrenheit -> Celsius |")
        println("|9 Sair                  |")
        println("--------------------------")
        print("Opcao: ")
        opcao = readln().toInt()

        when (opcao) {
            1 -> {
                print("Escreva os graus Celsius: ")
                val celcius: Double = readln().toDouble()
                val fahrenheit: Double = celcius*1.8 + 32
                println("$celcius = $fahrenheit")
            }
            2 -> {
                print("Escreva os graus Fahrenheit: ")
                val fahrenheit: Double = readln().toDouble()
                val celcius: Double = (fahrenheit-32) / 1.8
                println("$fahrenheit = $celcius")
            }
        }
    }
}