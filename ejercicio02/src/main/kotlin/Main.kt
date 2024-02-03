import coche.cars
import coche.persona
fun main(args: Array<String>) {
    val conductor = persona()
    val coche = cars()
    conductor.nombre = "juan"
    conductor.apellido = "perez"
    conductor.edad = 18
    coche.marca = "renaul"
    coche.modelo = "megane"
    coche.matricula = "7766gkx"
    coche.año = 2009
    conductor.datos()
    coche.coche()
}