import clase.relojDoce
import clase.relojVeinticuatro

fun main(args: Array<String>) {
    val ajuga = relojDoce()
    val digital = relojVeinticuatro()
    var opcion = 0

    do {
        println("Menú:")
        println("1. 12 horas")
        println("2. 24 horas")


        print("Seleccione una opción: ")
        opcion = readLine()?.toIntOrNull() ?: 0

    }while (opcion >3 )

    when (opcion) {
        1 -> doce(ajuga)
        2-> veinte(digital)

    }


}

fun veinte(digital: relojVeinticuatro) {
    digital.hora = 0
    digital.minuto = 0
    digital.segundo = 0
    digital.horas()
}

fun doce(reloj: relojDoce) {

    reloj.hora = 12
    reloj.minutos = 0
    reloj.segundos = 0

    reloj.horas()
}




