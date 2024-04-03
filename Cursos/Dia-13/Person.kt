open class Person(name: String, age: Int): Work(), Game {
    // Cualquier clase tiene una superclase comun "Any"

    open fun work() {
        println("Esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    // Game Interface
    override val game: String = "Minecraft"
        //get() = "Minecraft"

        override fun play() {
            println("Esta persona esta jugando a $game")
        }

}