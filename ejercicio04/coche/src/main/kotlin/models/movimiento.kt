package org.example.models

class movimiento(var encendidio: Boolean = true,
                 var marchaActual: Int = 0) {

   private var velocidadActual = 0
    var subirVelocidad = 15
    var bajarvelocidad = 5


    fun velocidad(pregunta: String) {
        when(pregunta){

          "+"->velocidadActual+= subirVelocidad
          "-"-> velocidadActual-= bajarvelocidad

        }


    }
    fun marcha(velocidad: Int){
         var velocidad = this.velocidadActual
        if (velocidadActual <= 0){
            encendidio = false
        }else if (velocidadActual < 30 ){
            marchaActual = 1
        }else if (velocidadActual < 50){
            marchaActual = 2
        }else if (velocidadActual < 70){
            marchaActual = 3
        }else if (velocidadActual < 80){
            marchaActual = 4
        }else if(velocidadActual < 100){
            marchaActual = 5
        }
    }

    fun gato(){
        encendidio = false
    }

    fun settvelocidad():Int{
        return velocidadActual
    }

    override fun toString(): String {
        return ("iba a $velocidadActual")
    }


}