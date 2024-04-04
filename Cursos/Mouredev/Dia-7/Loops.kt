fun main() {

}

fun loops() {
    // Bucles
    val myArray:List<String> = listOf("Hola", "Bienvenidos al tutorial", "Juanppdev")
    val myMap: MutableMap<String, Int> = mutableMapOf("Suscribete" to 1, "Pedro" to 2, "Sara" to 5)

    // Bucle For
    for(myString in myArray) {
        println(myString)
    }

    for(myElement in myMap) {
        println("${myElement.key}-${myElement.value}")
    }

    for (x in 0..10) {
        println(x)
    }

    for (x in 0 until 10) {
        println(x)
    }

    for (x in 0..10 step 2) {
        println(x)
    }

    for (x in 10..0 downTo 0 step 3) {
        println(x)
    }

    val myNumericArray = (0..20)
    for(myNum in myNumericArray) {
        println(myNum)
    }

    // Loop While
    var x = 0

    while(x < 10) {
        println(x)
        x++
    }

}