import java.time.LocalDateTime

class Carro(private var marca:String="", private var modelo:String="", private var velocidade:Double=0.0, private var ano:Int=0) {

    fun information() {
        println("Informação do Carro")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Velocidade: ${velocidade}Km/h ou ${milhas()}MPH")
        println("Ano: $ano")
        idade()
    }

    private fun idade(){
        val current = LocalDateTime.now().year
        println("Idade do carro é: ${current-this.ano}")
    }

    private fun milhas(): Int {
        return (this.velocidade*0.62137).toInt()
    }
}