fun main() {
    println("Escreva três números:")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    var num3 = readln().toInt()

    var media:Double = ((num1+num2+num3)/3).toDouble()
    println("A média dá: $media")
}