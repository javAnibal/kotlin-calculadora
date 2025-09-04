package level_1


/**
 * Punto de entrada principal de la app
 *
 * Objetivo:
 * Construcción de una calculadora interactiva que realiza las operaciones básicas
 * El programa pedirá confirmación para continuar o salir
 */
fun main() {

    println("=== Mi calculadora Kotlin ===")

    var continuar = true
    while (continuar) {
        val num1 = leerNumero("Ingresa el primer número")
        val num2 = leerNumero("Ingresa el segundo número")
        val operador = leerOperador()

        //=== Resultados ===
        val resultado = calcular(num1, num2, operador)
        if (resultado.isNaN()) {
            println("La operación no se puede realizar")
        } else {
            println("El resultado es : $resultado")
        }

        println("Desea realizar otra operación (s/n)")
        continuar = readLine()?.lowercase() == "s"

    }
}


// === FUNCIONES ===

/**
 * Lee un número ingresado por el usuario desde la consola.
 *
 * Internamente convierte la entrada con `toDoubleOrNull()`, que devuelve `null`
 * si la conversión falla. En ese caso, se asigna el valor `0.0` por defecto
 * y se muestra un mensaje de advertencia.
 *
 * @param mensaje Mensaje que se mostrará al usuario antes de pedir el valor.
 * @return El número ingresado convertido a [Double],
 *         o `0.0` si la entrada no es válida.
 */

fun leerNumero(mensaje: String): Double{

    println(mensaje)
    return readLine()?.toDoubleOrNull() ?:run {
        println("Entrada inválida. Se usará 0.0")
        0.0
    }
}

/**
 * Solicita al usuario que ingrese un operador matemático válido.
 *
 * Internamente utiliza [takeIf], que devuelve el valor ingresado
 * solo si cumple una condición (en este caso, que sea uno de `+`, `-`, `*`, `/`).
 * Si la condición no se cumple, se devuelve `null` y se asigna `"+"` como valor por defecto.
 *
 * @return El operador ingresado si es válido.
 *         En caso de error, se devuelve `"+"` por defecto.
 */

fun leerOperador(): String{

    println("Elige el operador (+, -, *, /) ")
    return readLine()?.takeIf {it in listOf("+", "-", "*", "/")} ?: run{
        println("Operador inválido. Se usará `+` por defecto.")
        "+"
    }

}

/**
 * Realiza una operación matemática básica entre dos números.
 *
 * Si el operador es inválido o se intenta dividir entre cero,
 * el resultado será [Double.NaN]. Este valor especial significa
 * *Not a Number* y se usa en matemáticas para representar
 * resultados indefinidos.
 *
 * @param a Primer operando.
 * @param b Segundo operando.
 * @param operador El operador a aplicar: `+`, `-`, `*`, `/`.
 * @return El resultado de la operación como [Double],
 *         o [Double.NaN] si la operación no es válida.
 */

fun calcular (a: Double, b: Double, operador: String): Double{
    return when (operador){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" ->  if(b != 0.0) a/b else Double.NaN
        else -> Double.NaN
    }

}






