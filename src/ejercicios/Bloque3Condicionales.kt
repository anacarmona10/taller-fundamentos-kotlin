package ejercicios

fun  ejecutarBloque3() {
    // Ejercicio 11
    val edad = 20
    if (edad >= 18) {
        println("11. Puede votar")
    } else {
        println("11. No puede votar")
    }

    // Ejercicio 12
    val nota = 85
    val resultado = if (nota >= 60) "Aprobado" else "Reprobado"
    println("12. Resultado: $resultado")

    // Ejercicio 13
    val colorSemaforo = "Verde"
    when (colorSemaforo) {
        "Rojo" -> println("13. Pare")
        "Amarillo" -> println("13. Precaución")
        "Verde" -> println("13. Siga")
        else -> println("13. Color no válido")
    }

    // Ejercicio 14
    val temperatura = 18
    when (temperatura) {
        in Int.MIN_VALUE..<15 -> println("14. Frío")
        in 15..25 -> println("14. Templado")
        else -> println("14. Calor")
    }

    // Ejercicio 15
    val variable: Any = "Hola mundo"
    when (variable) {
        is String -> println("15. Es un String: $variable")
        is Int -> println("15. Es un Int: $variable")
        else -> println("15. Es otro tipo")
    }
}