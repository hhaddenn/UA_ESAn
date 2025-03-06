fun main() {

    var carro1 = Carro(marca="Renault", modelo="Clio", velocidade=120.0, ano=2005)
    carro1.information()
    println()
    var carro2 = Carro(marca="Volkswagen", modelo="Golf", velocidade=160.0, ano=2001)
    carro2.information()
    println()
    var carro3 = Carro(marca="BMW", modelo="M3", velocidade=230.0, ano=2020)
    carro3.information()
    println()
    var carro4 = Carro(marca="Ford", modelo="Focus", velocidade=180.0, ano=2024)
    carro4.information()
    println()
}