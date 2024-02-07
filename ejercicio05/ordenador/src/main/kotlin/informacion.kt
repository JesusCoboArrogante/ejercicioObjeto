package org.example

class informacion(var aula: String, var curso: String, var informacion: String) {

    override fun toString():String{
       for (i in informacion.indices){

       }
        return ("en el aula $aula del curso $curso, tiene esto ordenadores $informacion")
    }



}