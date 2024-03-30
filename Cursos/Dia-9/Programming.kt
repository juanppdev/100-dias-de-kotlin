class Programmer(val name: String,
                var age: Int,
                val languages: Array<Languages>,
                val friends: ArrayOf<Programmer>? = null) {
    fun code() {

        enum class Languages {
            KOTLIN,
            SWIFT,
            JAVA,
            JAVASCRIPT
        }

        for (language in languages) {
            println("Estoy programando en $language")
        }
    }
}