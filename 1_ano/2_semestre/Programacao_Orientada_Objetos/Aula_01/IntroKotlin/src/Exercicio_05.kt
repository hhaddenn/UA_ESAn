fun main() {
    print("Escreva um número: ")
    val num: Int = readln().toInt()
    if (num % 6 == 0) {
        println("$num é divisível por 6")
    } else {
        println("$num não é divisível por 6")
    }
}