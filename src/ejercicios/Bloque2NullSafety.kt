package ejercicios

fun ejecutarBloque2() {
    // Ejercicio 6
    var apodo: String? = null

    // Ejercicio 7
    val nombreMostrar = apodo ?: "Sin apodo"
    println("7. Apodo: $nombreMostrar")

    // Ejercicio 8
    val texto: String? = "Kotlin"
    println("8. Longitud del texto: ${texto?.length}")

    // Ejercicio 9
    var correo: String? = "usuario@ejemplo.com"
    correo?.let {
        println("9. Correo enviado a $it")
    }

    // Ejercicio 10
    var variableNula: String? = null
    variableNula = "Ahora tengo valor"
    val longitud = variableNula!!.length
    println("10. Longitud usando !!: $longitud")
}

