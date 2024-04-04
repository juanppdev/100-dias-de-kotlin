fun resultado(value: Any) {

    when(value) {
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("Holiwi")
    }

}

fun getSemester(month: Int) {

    when(month) {
        in 1 .. 6  -> print("Primer Semestre")
        in 7 .. 12 -> print("Segundo Semestre")
        !in 1..12 -> println("Semestre no valido")
    }

}

fun getTrimester(month:Int) {

    when(month) {
        1, 2, 3 -> print("Primer Trimestre")
        4, 5, 6  -> print("Segundo Trimestre")
        7, 8, 9 -> print("Tercer Trimestre")
        10, 11, 12 -> print("Cuarto Trimestre")
        else -> println("Trimestre no valido")
    }

}

fun getMonth(month: Int) {

    when(month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> {
            println("Octubre")
            println("Octubre")
        }
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes valido")


    }

}