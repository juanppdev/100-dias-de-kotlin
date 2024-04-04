// Nested and Inner Classes

private fun nestedAndInnerClasses() {
    // Clase Anidada (Nestd Class)
    val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
    val sum = myNestedClass(1, 5)
    println("El resultado de la suma es $sum")

    // Clase Interna (Inner)
    val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
    val sumTwo = myInnerClass.sumTwo(10)
    println("El resultado de sumar dos es $sumTwo")
}