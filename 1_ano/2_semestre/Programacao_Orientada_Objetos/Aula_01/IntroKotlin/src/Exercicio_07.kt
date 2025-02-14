fun main() {
    var opcao: Int = 0
    while(opcao != 9) {
        println()
        println("---------------")
        println("|Calculadora  |")
        println("---------------")
        println("|1 Somar      |")
        println("|2 Subtrair   |")
        println("|3 Multiplicar|")
        println("|4 Dividir    |")
        println("|9 Sair       |")
        println("---------------")
        print("Escolha uma opção -> ")
        opcao = readln().toInt()
        println()
        when (opcao) {
            1 -> {
                print("Número 1: ")
                val num1: Double = readln().toDouble()
                print("Número 2: ")
                val num2: Double = readln().toDouble()
                val num3: Double = num1 + num2
                println("$num1 + $num2 = $num3")
            }
            2 -> {
                print("Número 1: ")
                val num1: Double = readln().toDouble()
                print("Número 2: ")
                val num2: Double = readln().toDouble()
                val num3: Double = num1 - num2
                println("$num1 - $num2 = $num3")
            }
            3 -> {
                print("Número 1: ")
                val num1: Double = readln().toDouble()
                print("Número 2: ")
                val num2: Double = readln().toDouble()
                val num3: Double = num1 * num2
                println("$num1 x $num2 = $num3")
            }
            4 -> {
                print("Número 1: ")
                val num1: Double = readln().toDouble()
                print("Número 2: ")
                val num2: Double = readln().toDouble()
                val num3: Double = num1 / num2
                println("$num1 / $num2 = $num3")
            }
        }
    }
}