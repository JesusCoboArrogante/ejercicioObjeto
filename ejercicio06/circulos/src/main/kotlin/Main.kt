package org.example
import org.example.models.anadir
import org.example.models.matematicas

fun main() {
    val a = arrayOf("a","b","c")
    val b = arrayOf("b","b","a")
    var respuesta = ""
    val ingresar = anadir()
    println("quieres añadir elemento SI/NO")
    respuesta = readLine() ?: ""

    when(respuesta){
        "si" -> ingresar
        "no" ->
    }

    val prueba = matematicas()

    prueba.igual(a,b)
    println()
    prueba.union(a,b)
    println()
    prueba.cardinalidad(a)

}