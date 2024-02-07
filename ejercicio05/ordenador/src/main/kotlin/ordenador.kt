package org.example

class ordenador (var placaBase:String, var ram:String,var procesador:String,var memoria:String) {

    override fun toString(): String {
        return ("una placa de $placaBase una ram de $ram, el procesodor de $procesador y la memoria  de $memoria ")
    }
}