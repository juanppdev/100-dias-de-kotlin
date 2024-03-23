fun main() {

    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    // Indice 0-6
    // Tamaño 7
    println(weekDays[0])
    println(weekDays.size)

    // tAMAñOS
    if(weekDays.size >= 8) {
        println(weekDays[7])
    } else {
        println("No hay mas valores en el array")
    }

    // Modificar
    weekDays[0] = "Holiwis"
    println(weekDays[0])

    // Bucles para array
    for(position in weekDays.indices) {
        //println(position)
        println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()) {
        println("La posicion $position, contiene $value")
    }

    for(weekDay in weekDays) {
        println("Ahora es $weekDay")
    }

}