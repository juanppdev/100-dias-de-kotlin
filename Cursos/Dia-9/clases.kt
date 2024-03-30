fun main() {

}


// Una clase es conocida como un objeto
fun clases() {
    //val juanppdev = Programmer("Juanppdev", 25, arrayOf("Kotlin", "Swift"))
    //val juanppdev = Programmer("Juanppdev", 25, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
    val juanppdev = Programmer("Juanppdev", 25, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
    println(juanppdev.name) // Imprime el nombre de la persona "Juanppdev"
    juanppdev.age = 30
    juanppdev.code()

    //val sara = Programmer("Sara", 35, arrayOf("Java"))
    //val sara = Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA))
    val sara = Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA), arrayOf(juanppdev))
    sara.code()

    println("${sara.friends?.first()?.name} es amigo de $sara.name")
}