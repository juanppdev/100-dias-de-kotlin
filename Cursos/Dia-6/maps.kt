// En un map no pueden haber claves repetidas
fun main() {
    maps()
}

fun maps() {
    var myMap: Map<String, Int> = mapOf()
    println(myMap)

    // Añadir Elementos
    //myMap = mapOf("Juanppdev" to 1, "Pedro" to 2, "Sara" to 5)
    myMap = mutableMapOf("Juanppdev" to 1, "Pedro" to 2, "Sara" to 5)
    println(myMap)

    // Añadir solo un valor
    myMap["Ana"] = 7
    myMap.put("Maria", 8)
    println(myMap)

    // Actualizacion de un dato
    myMap.put("Juanppdev", 3)
    myMap.put("Juanppdev", 4)
    println(myMap)

    myMap.put("Marcos", 3)
    println(myMap)

    // Acceso a un dato
    println(myMap["Juanppdev"])

    // Eliminar un dato
    myMap.remove("Juanppdev")
    println(myMap)
}