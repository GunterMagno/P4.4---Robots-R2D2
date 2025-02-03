class R2D2 (val nombre :String,){

    private var posX = 0
    private var posY = 0
    private var direccion = Direccion

    private fun mover(movimientos: Array<Int>){
        for(movimiento in movimientos){
            when {
                direccion -> "PosX" {}

                direccion -> "PosY" {}

                direccion -> "NegX" {}

                direccion -> "NegY" {}
            }
        }
    }

    private fun obtenerPosicion() {"(x = $posX, y = $posY)"}

    private fun obtenerDireccion(){"$direccion"}

    override fun toString(): String {return "R2D2 está en ${obtenerPosicion()} con direccion ${obtenerDireccion()}"}
}