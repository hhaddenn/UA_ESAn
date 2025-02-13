fun main(){
    print("Escreva a idade do nadador -> ")
    val idade = readln().toInt()
    when {
        idade in 5..7 -> println("Infantil A")
        idade in 8..10 -> println("Infantil B")
        idade in 11..13 -> println("Juvenil A")
        idade in 14..17 -> println("Juvenil B")
        idade >= 18 -> println("Sênior")
        else -> println("Não pode nadar")
    }
}