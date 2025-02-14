fun main(){
    print("Escreva um número: ")
    val num: Int = readln().toInt()
    if (num % 2 == 0){
        println("$num é par")
    } else {
        println("$num é ímpar")
    }
}