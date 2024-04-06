private fun DestructuringDeclarations() {
    
    //val Juan = Worker("Juan Pablo", 25, "Programador")
    //val (name, age, work) = Worker("Juan Pablo", 25, "Programador")
    val (name, _, work) = Worker("Juan Pablo", 25, "Programador")
    //println("$name, $age, $work")
    println("$name, $work")

    val juanppdev = Worker("Juanppdev", 25, "Programador")
    println(juanppdev.component1())

    //val juan = myWorker()
    //val (juanName, juanAge, juanWork) = myWorker()
    val (juanName, juanAge) = myWorker()
    println("$juanName, $juanAge")

    val myMap = mapOf(1 to "Juan", 2 to "Brais", 3 to "Ana")
    for ((id, name)/*element*/ in myMap) {
        //println("${element.key} - ${element.value}")
        //println("${element.component1()} - ${element.component2()}")
        println("${id} - ${name}")
    }

}

private fun myWorker(): Worker {
    return Worker("Juan Pablo", 25, "Programador")
}
