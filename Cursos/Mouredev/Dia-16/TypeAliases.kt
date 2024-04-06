typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean
//typealias MyNestedClass = MyNestedAndInnerClass.MyNestedClass

class MainActivity: AppCompatActivity() {

    private var myMap: MyMapList = mutableMapOf()

    private fun typeAliases() {
        var myNewMap: MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("Juan", "Pablo")
        myNewMap[2] = arrayListOf("Juanppdev", "by MundoCode")

        MyMap = myNewMap
    }
}