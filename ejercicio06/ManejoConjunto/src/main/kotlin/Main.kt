package org.example

import org.example.models.matematicas

fun main() {
    val a = matematicas()

    a.parteA = arrayOf("x,y,z")

    for (i in a.parteA.size){
        
    }
    println(a.parteA)
    println(a.parteB)
}