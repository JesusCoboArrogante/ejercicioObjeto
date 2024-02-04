package org.example

import org.example.models.coche
import org.example.models.movimiento

fun main() {
    var vehiculo1 = coche("seat", "ateca", "blanco", "1812LAN")
    var movimiento = movimiento()
    var pregunta = ""






    var gato = (0..100).random()

    do {



        println("subir velocidad o bajar velocidad")
        pregunta = readln().toString()

        movimiento.velocidad(pregunta)
        movimiento.marcha(movimiento.settvelocidad())
        println(movimiento.settvelocidad())
        println(movimiento.marchaActual)

         if(gato<=10){
            movimiento.gato()
            println(gato)
            println("hostion con el gato")
        }


        if (movimiento.settvelocidad() > 200){
            println("el coche lo has quemado")
            movimiento.gato()
        }

    }while (movimiento.encendidio)
    println(vehiculo1.toString())
    println(movimiento.toString())

}