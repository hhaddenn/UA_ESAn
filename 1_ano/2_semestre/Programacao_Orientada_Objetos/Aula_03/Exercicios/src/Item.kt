class Item(val nome:String, var preco: Double, var imposto: Double=0.23) {
    fun valorFinal(): Double = preco + (preco*imposto)

    val valorFinal:Double
        get() = preco + (preco*imposto)
}