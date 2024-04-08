fun lambdas() {

    val myInList = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val myFilterIntList = myIntList.filter { myInt ->
        
        println(myInt)
        if(myInt == 1) {
            return@filter true
        }

        myInt > 5
    }

    println(myFilterIntList)

    val mySumFun = fun(x: Int, y: Int): Int = x + y
    val myMultFun = fun(x: Int, y: Int): Int = x * y

    myAsyncFun("Juanppdev") {
        println(it) // Juanppdev
    }

    println(myOperateFun(5, 10, mySumFun))
    println(myOperateFun(5, 10, myMultFun))
    println(myOperateFun(5, 10) { x, y -> x - y})


}

private fun myOperateFun(x: Int, y: Int, myFun: (Int, Int) -> Int): Int {

    return myFun(x, y)

}

private fun myAsyncFun(name: String, hello: (String) -> Unit) {
    val myNewString = "Hello $name!"
    //hello(myNewString)

    thread {
        Thread.sleep(5000)
        hello(myNewString)
    }
}