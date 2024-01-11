package coche

class persona (
    var nombre: String = " ",
    var edad: Int = 0,
) {
    var apellido = " "
    constructor(nombre: String, apellido: String, edad: Int) : this(nombre, edad) {
        fun datos (){
            print("El conductor es $nombre apellido $apellido de $edad")

        }
    }

}