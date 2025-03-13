package automovel

class Bicicleta(
    override val marchas: Int
) : Automovel, Bipedal {
    override fun movimentar(km: Double) {
        println("Movimentou ${km}Km")
    }

    override fun fazerCurva(angulo: Double) {
        println("Curva com ângulo: $angulo")
    }

    override fun trocarMarch(novaMarcha: Int) {
        println("Trocar para $novaMarcha")
    }
}