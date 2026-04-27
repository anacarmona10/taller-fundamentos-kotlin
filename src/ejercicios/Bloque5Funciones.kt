package ejercicios

// Ejercicio 21
fun saludar(nombre: String): String {
    return "21. Hola, $nombre!"
}

// Ejercicio 22
fun sumar(a: Int, b: Int) = a + b

// Ejercicio 23
fun crearRectangulo(ancho: Int, alto: Int = 10): String {
    return "23. Rectángulo de $ancho x $alto"
}

// Ejercicio 24
fun llamarFuncionRectangulo() {
    val rectangulo = crearRectangulo(ancho = 15)
    println(rectangulo)
}

// Ejercicio 25
fun convertirDolarAPesos(dolares: Double, tasaCambio: Double = 4000.0): Double {
    return dolares * tasaCambio
}

fun  ejecutarBloque5() {
    println(saludar("Ana"))
    println("22. Suma: ${sumar(5, 3)}")
    println(crearRectangulo(5))
    llamarFuncionRectangulo()
    println("25. 100 USD son ${convertirDolarAPesos(100.0)} COP")
}