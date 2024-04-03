interface Game {
// La propiedad interface no puede tener un constructor
    val game: String

    fun play()

    fun stream() {
        println("Estoy haciendo stream de mi juego $game")
    }
}