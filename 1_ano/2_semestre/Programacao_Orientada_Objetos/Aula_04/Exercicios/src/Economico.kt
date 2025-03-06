class Economico(
    modelo: String,
    litrosTanque: Double,
    litrosKm: Double
): Automovel(modelo, litrosTanque, litrosKm) {
    override fun consumirTanque(litros: Double) {
        this.litrosTanque -= (litros*0.07)
    }
}