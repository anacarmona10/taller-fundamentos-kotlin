package ejercicios

// Ejercicio 26
fun listaDeCompras() {
    val productos = mutableListOf("Manzana", "Pan", "Leche")
    println("26. Lista original: $productos")
    productos.add("Huevos")
    println("26. Añadido Huevos: $productos")
    productos.removeAt(1) // Elimina el segundo elemento (índice 1)
    println("26. Eliminado segundo elemento: $productos")
}

// Ejercicio 27
fun filtrarPrecios() {
    val precios = listOf(30.0, 55.0, 20.0, 80.0, 45.0, 60.0)
    val menores50 = precios.filter { it < 50 }
    println("27 Precios menores a 50: $menores50")
}

// Ejercicio 28
fun buscarPorA() {
    val amigos = listOf("Carlos", "Ana", "Luis", "Andrés", "María")
    val nombreConA = amigos.find { it.startsWith('A') }
    println("28. Primer nombre que empieza con A: $nombreConA")
}

// Ejercicio 29
fun Int.esNegativo(): Boolean = this < 0

// Ejercicio 30
fun String.quitarEspacios(): String = this.replace(" ", "")

fun ejecutarBloque6() {
    listaDeCompras()
    filtrarPrecios()
    buscarPorA()

    val numero = -5
    println("29. ¿$numero es negativo? ${numero.esNegativo()}")

    val texto = "Hola mundo desde Kotlin"
    println("30. Sin espacios: ${texto.quitarEspacios()}")
}
