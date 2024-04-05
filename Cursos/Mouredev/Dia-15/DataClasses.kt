private fun dataClasses() {
    val juan = Worker("Juan Pablo", 25, "Programador")
    juan.lastWork = "Cantante"

    val juanppdev = Worker("Juan Pablo", 25, "Programador")
    juanppdev.lastWork = "Cantante"

    val sara = Worker()

    // Equals y hashCode
    // En equals tambien se puede usar el //
    if(juan.equals(juanppdev)) {
        println("Son iguales")
    } else {
        println("No son iguales")
    }

    // toString()
    println(juan.toString())

    // Copy
    val juan2 = juan.copy(age = 34)
    println(juan.toString())
    println(juan2.toString())

    // componentN
    val (name, age) = juanppdev
    println(name)
    println(age)
}
