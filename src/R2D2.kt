class R2D2 (val nombre :String){

    private var posX = 0
    private var posY = 0
    private var direccion = Direccion.PosY

    fun mover(movimientos: Array<Int>){
        for(movimiento in movimientos){
            when {
                direccion == Direccion.PosY -> posY += movimiento

                direccion == Direccion.PosX -> posX += movimiento

                direccion == Direccion.NegY -> posY -= movimiento

                direccion == Direccion.NegX -> posX -= movimiento
            }
            nuevaDireccion()
        }
    }

    private fun nuevaDireccion(){
        val direcciones = Direccion.entries.toTypedArray()
        val indiceActual = direcciones.indexOf(direccion)
        val nuevoIndice = (indiceActual + 1) % direcciones.size
        direccion = direcciones[nuevoIndice]
    }

    private fun obtenerPosicion(): String{
        return "(x= $posX, y= $posY)"
    }

    private fun obtenerDireccion(): Direccion{
        return direccion
    }

    override fun toString(): String {return "R2D2 está en ${obtenerPosicion()} con direccion ${obtenerDireccion()}"}
}