private class Visibility {

    //var name: String? = null
    private var name: String? = null

    private fun sayMyName() {
        name?.let {
            println("Mi nombre es $it")
        } ?: run {
            println("No tengo nombre")
        }
    }
}

open class VisibilityTwo {

    protected fun sayMyNameTwo() {
        val visibility = Visibility()
        visibility.name = "Juanppdev" //Te va a dar error
    }
}

class VisibilityThree: VisibilityTwo { // Para usar "VisibilityTwo" debe tener la clase open

    internal val age: Int?  = null

    fun sayMyNameThree() {
        sayMyNameTwo()
    }

}