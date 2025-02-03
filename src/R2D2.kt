class R2D2 (val nombre :String,){

    private var posX = 0
    private var posY = 0
    private var direccion = Direccion.PosY

    private fun mover(movimientos: Array<Int>){
        for(movimiento in movimientos){
            when {
                direccion == Direccion.PosY {}

                direccion == Direccion.PosX {}

                direccion == Direccion.NegY {}

                direccion == Direccion.NegX {}
            }
            if (direccion == Direccion.PosY){

            }else if (direccion == Direccion.PosX){

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