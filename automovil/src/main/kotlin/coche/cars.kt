package coche


class cars (
    var marca: String = "",
    var modelo: String = "") {
    var matricula = ""
    var año = 0
    constructor(marca:String,modelo:String, matricula:String):this(marca, modelo){

    }
    fun coche(){
        print(" el coche es un $marca modelo $modelo, la matricula es $matricula del año $año ")
    }
}