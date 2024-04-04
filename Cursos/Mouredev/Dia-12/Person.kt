open class Person(name: String, age: Int): Work() {
    // Cualquier clase tiene una superclase comun "Any"

    open fun work() {
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

}