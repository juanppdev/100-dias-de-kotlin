private fun InheritanceClass() {

    val persona = Persona("Sara", 40)

    val programmer = Programmer("Juan Pablo", 25, "Kotlin")
    programmer.work()
    programmer.sayLanguage()
    programmer.goToWork()
    programmer.drive()

    val designer = Designer("Carlos", 30)
    designer.work()
    designer.goToWork()

}