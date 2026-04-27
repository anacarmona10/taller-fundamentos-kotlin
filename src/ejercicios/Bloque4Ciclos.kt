package ejercicios

fun ejecutarBloque4() {
    // Ejercicio 16
    println("16. Conteo 1 a 10:")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // Ejercicio 17
    println("17. Cuenta regresiva 10 a 1:")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // Ejercicio 18
    println("18. Saltos de 3 (1 a 20):")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    // Ejercicio 19
    var energia = 5
    println("Niveles de energía:")
    while (energia > 0) {
        println("19. Energía: $energia")
        energia--
    }

    // Ejercicio 20
    var password: String
    do {
        print("Ingrese contraseña: ")
        password = "1234" // Simulación de entrada
        if (password != "1234") println("19. Contraseña incorrecta")
    } while (password != "1234")
    println("19. Acceso concedido")
}