package automovel

class Ligeiro(
    val modelo: String,
    val velocidadeMaxima: Double
) : Automovel {
    override fun movimentar(km: Double) {
        println("Movimentou ${km}Km em ${(km/velocidadeMaxima)*60}min")
    }

    override fun fazerCurva(angulo: Double) {
        println("Curva com ângulo: $angulo")
    }
}