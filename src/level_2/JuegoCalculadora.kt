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
    if(edad >= 18 ){
        println("Eres mayor de edad $edad años")
    }else{
        val edadMenor = 18 - edad
        println("Tienes $edadMenor")
    }



}



// === Funciones ====

fun leerEdad(mensaje: String): Double {

    println(mensaje)
    return readLine()?.toDoubleOrNull()?: run{

        println("Entrada inválida. Se asigna valor por defecto (0.0)")
        0.0
    }


}




