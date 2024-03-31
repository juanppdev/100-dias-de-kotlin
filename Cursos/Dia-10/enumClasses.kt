// Intermedio
enum class Direction(val dir: Int) {
    NORTH(1),
    SOUTH(-1),
    EAST(1), 
    WEST(-1);

    fun description(): String {
        return when(this) {
            NORTH -> "La direccion es NORTE"
            SOUTH -> "La direccion es SUR"
            EAST  -> "La direccion es ESTE"
            WEST  -> "La direccion es OESTE"
        }
    }
}

private fun enumClasses() {
    var userDirection: Direction?  = null
    println("Direccion $userDirection")   //null

    userDirection = Direction.NORTH
    println("Direccion $userDirection")

    userDirection = Direction.EAST
    println("Direccion $userDirection")

    println("Propiedad name: ${userDirection.name}")
    println("Propiedad ordinal: ${userDirection.ordinal}")

    // Funciones
    println(userDirection.description())

    // Inicializacion
    println(userDirection.dir)
}
/*
    EnumClass.valueOf(value:)
    Crea un enum en base a su nombre en formato String.

    EnumClass.values()
    Ratorna un array con todos los valores posibles.
*/