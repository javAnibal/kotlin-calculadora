fun main() {
println("=== Bienvenido al programa combinado de Kotlin ===")

    var continuar = true

    while (continuar) {
        // Mostrar el menú principal
        println("\nElige una opción:")
        println("1. Calculadora")
        println("2. Adivina el número")
        println("3. Salir")

        val opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> calculadora()
            2 -> adivinaNumero()
            3 -> {
                println("Gracias por usar el programa. ¡Hasta luego!")
                continuar = false
            }
            else -> println("Opción inválida. Intenta nuevamente.")
        }
    }
}

/**
* Función para ejecutar la calculadora básica.
  */
  fun calculadora() {
  println("\n=== Calculadora ===")

  // Leer primer número
  print("Ingresa el primer número: ")
  val num1 = readLine()?.toDoubleOrNull() ?: run {
  println("Entrada inválida. Se usará 0.0")
  0.0
  }

  // Leer segundo número
  print("Ingresa el segundo número: ")
  val num2 = readLine()?.toDoubleOrNull() ?: run {
  println("Entrada inválida. Se usará 0.0")
  0.0
  }

  // Realizar operaciones
  println("Suma: ${num1 + num2}")
  println("Resta: ${num1 - num2}")
  println("Multiplicación: ${num1 * num2}")
  if (num2 != 0.0) {
  println("División: ${num1 / num2}")
  } else {
  println("División: Error, no se puede dividir entre cero")
  }
  }

/**
* Función para ejecutar el juego "Adivina el número".
  */
  fun adivinaNumero() {
  println("\n=== Adivina el número ===")

  val numeroSecreto = (1..10).random()
  var adivinado = false

  while (!adivinado) {
  print("Ingresa un número entre 1 y 10: ")
  val intento = readLine()?.toIntOrNull() ?: run {
  println("Entrada inválida. Intenta de nuevo.")
  continue
  }

       when {
           intento < numeroSecreto -> println("El número es más alto")
           intento > numeroSecreto -> println("El número es más bajo")
           else -> {
               println("¡Correcto! Has adivinado el número $numeroSecreto")
               adivinado = true
           }
       }
  }
  }
