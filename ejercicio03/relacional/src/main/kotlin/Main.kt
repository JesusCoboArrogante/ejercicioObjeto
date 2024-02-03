package org.exampleCFC
import org.example.clase.fraccion

fun main() {
    var num = 0
    var den = 0
    println("elige un numerador")
    num = readln().toIntOrNull()?:0
    println("elige otro denominador")
    den = readln().toIntOrNull()?:0

    val suma = fraccion()
    val a = fraccion(5,25)
    val b = fraccion(num,den)
    val multiplicar = fraccion()

    suma.settsumar(a,b)
    println(suma.getnumerador())
    println(suma.getdenominador())
    println(a.toString())

    println()

    multiplicar.settMultiplicar(a,b)
    println(multiplicar.getnumerador())
    println(multiplicar.getdenominador())
    println(b.toString())







   












}


