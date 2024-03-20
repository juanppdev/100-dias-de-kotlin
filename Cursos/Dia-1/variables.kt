fun main() {
    variablesNumericas()
    variablesAlfanumericas()
    variablesBooleanas()
}

fun variablesNumericas() {
     /**
     * Variables Numericas
     */

    // Int -2,147,483,647 a 2,147,483,647
    var age2:Int = 25

    // Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example:Long = 38

    // Float
    val floatExample:Float = 30.5f

    // Double
    val doubleExample:Double = 3241.3123123

    println("Sumar")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("División")
    println(age / age2)

    println("Modulo")
    println(age % age2)

    println(age + example)
    println(age + floatExample)

    var exampleSuma = age + floatExample
}

fun variablesAlfanumericas() {
    /**
     * Variables Alfanumericas
     */

    // Char
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    // String
    val stringExample:String = "MundoCode"
    val stringExample2 = "MundoCode"
    val stringExample3 = "4"
    val stringExample4 = "23"

    println(stringExample3 + stringExample4)
    println(stringExample3.toInt() + stringExample4.toInt())

    var stringConcatenada:String = "Hola"
    println(stringConcatenada)
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    print(stringConcatenada)
    val example123:String = age.toString()
}

fun variablesBoolean() {

    /**
     * Variables booleanas
     */

    val booleanEcample:Boolean = true
    val booleanEcample2:Boolean = true

}