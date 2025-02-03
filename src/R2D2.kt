class R2D2 (val nombre :String,){

    private var posX = 0
    private var posY = 0
    private var direccion = Direccion.PosY

    private fun mover(movimientos: Array<Int>){
        for(movimiento in movimientos){
            when {
                direccion == Direccion.PosY -> posY += movimiento

                direccion == Direccion.PosY -> posX += movimiento

                direccion == Direccion.NegY -> posY -= movimiento

                direccion == Direccion.NegY -> posX -= movimiento
            }
            nuevaDireccion()
        }
    }

    private fun nuevaDireccion(){
        //como la cambio a la siguiente .-.
    }

    private fun obtenerPosicion(){"(x= $posX, y= $posY)"}

    private fun obtenerDireccion(){direccion}

    override fun toString(): String {return "R2D2 está en ${obtenerPosicion()} con direccion ${obtenerDireccion()}"}
}