package org.example

fun main() {
    var ordenador1 = ordenador("a1","1","p1","10")
    var ordenador2 = ordenador("b2","2","p2","11")
    var ordenador3 = ordenador("c3","3","p3","12")
    var ordenador4 = ordenador("d4","4","p4","13")

    val informacion2 =informacion("11","1B", ordenador1.toString())
    val informacion =informacion("11","1B", ordenador2.toString())
    val informacion1 = informacion("12","2B", ordenador3.toString())
    val informacion3 =informacion("13","3B", ordenador4.toString())

    val c = arrayOf(informacion,informacion2, informacion1, informacion3)
    for (i in c.indices){
        println(c[i])
    }













}




