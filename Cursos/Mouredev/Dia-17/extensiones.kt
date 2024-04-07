private fun extensions() {
    
    val myDate = Date()
    println(myDate.customFormat())
    println(myDate.formatSize)

    val myDateNullable: Date? = null
    if(myDateNullable != null) {
        println(myDateNullable.customFormat())
        println(myDateNullable.formatSize)
    }
}