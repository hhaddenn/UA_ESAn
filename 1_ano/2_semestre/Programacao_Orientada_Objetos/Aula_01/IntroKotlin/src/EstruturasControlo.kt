fun main() {
    /* println("How old are you?")
    val idade = readln().toInt()

    if (idade >= 18) {
        println("Podes votar!")
    } else {
        println("Não podes votar!")
    }

    when (idade) {
        18 -> {
            println("Podes votar!")
        }
        17 -> {
            println("Quase podes votar!")
        }
        else -> println("Idk")
    }

    for (i in 1..10){
        print("$i ")
        if (i==10) {
            println()
        }
    }

    val num=2
    if (num==2) {
        var num = 10
    }
    print("2 foi alterado para $num")
     */

    for (i in 1..20 step 2) {
        print("$i ")
    }
    println()
    for (i in 20 downTo 0 step 2) {
        print("$i ")
    }
}