package org.example.models


class coche (var marca:String, var modelo:String, var color:String, var matricula:String) {

    override fun toString(): String {
        return ("el coche de marca $marca, modelo $modelo, color $color y matricula $matricula")
    }
}