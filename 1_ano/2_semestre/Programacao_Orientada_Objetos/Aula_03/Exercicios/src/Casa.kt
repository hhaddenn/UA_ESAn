class Casa(private var dono:String="", private var janelas:Int=0, private var cor:String="") {
    fun information() {
        println("Informação da Casa")
        println("Dono: $dono")
        println("Janelas: $janelas")
        println("Cor: $cor")
    }
}