package level_2

/* Objetivo: Practicar fundamentos de Kotlin
     Calculadora de edad
     Programa que:
     Pide el año de nacimiento
     Calcula la edad actual
     Determina si la persona es mayor de edad
     Muestra mensaje personalizado

*/

/**
 * Entrada principal del programa
 */
fun main() {


    println("=== Calculando Edad ===")

    val edad = leerEdad("Ingrese edad:")



}


// toDoubleOrNull() -> evita excepciones si el usuario escribe algo NO numérico
// FallBack -> se asigna valor por defecto (0.0)
// run -> sirve para encadenar operaciones
// ?: -> Operador "Elvis" -> si la expresión es nula TOMA ese valor, SI es nula usa valor por defecto

// === Funciones ====



fun leerEdad(mensaje: String): Double ?{

    println(mensaje)
    return readLine()?.toDoubleOrNull()?: run{

        println("Entrada inválida. Se asigna valor por defecto (0.0)")
        0.0
    }


}




