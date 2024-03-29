fun main() {
    funciones()
}

fun funciones() {
    sayHello()
    sayHello()
    sayHello()

    sayMyName("Juanppdev")
    sayMyName("Pedro")
    sayMyName("Sara")

    sayMyNameAndAge("Juan", 25)

    val sumResult = sumToNumbers(10, 5)
    println(sumResult) // Imprime: The result is
    println(sumToNumbers(10, sumToNumbers(5, 5)))
}

// Funcion simple
fun sayHello() {
    println("Hola")
}

// Funciones con un parametro
fun sayMyNameAndAge(name: String, age: Int) {
    println("Hola, mi nombre es $name y mi edad es $age")
}

// Funciones con un valor de retorno
fun sumToNumbers(firstNumber: Int, secondNumber: Int) {
    val sum = firstNumber + secondNumber
    return sum
}