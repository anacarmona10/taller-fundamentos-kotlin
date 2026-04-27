package ejercicios

fun ejecutarBloque1() {
    println(" BLOQUE 1: VARIABLES ")

    //Ejercicio 1
    val nombre = "Ana"
    var ciudad = "Medellín"
    var ciudad= "Bello"
    println("1. Nombre: $nombre" + " 2. Ciudad: $ciudad")

    //Ejercicio 2
    val anioNacimiento = 2008
    var anioActual = 2026
    var edad = anioActual - anioNacimiento
    println("2. Tienes $edad años")

    //Ejercicio 3
    var precioCoche: Double = 10000.0
    var pesoNaranja: Float = 10.3f
    var poblacionMundo: Long = 2000000000000000000L

    println("3. Un coche cuesta $precioCoche dolares, " + "una naranja pesa $pesoNaranja gramos, " + "la población mundial es igual a $poblacionMundo de personas")

    //Ejercicio 4
    val estalloviendo = true
    println("4. ¿Esta lloviendo? $estalloviendo")

    // Ejercicio 5
    println("5. Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")

}

object Constants {
    const val VELOCIDAD_LUZ = 299_792_458 // en metros por segundo
}