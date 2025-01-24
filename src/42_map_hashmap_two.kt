fun main(args: Array<String>) {

/** HashMap */

/** Key-Value Pair */

    var myMap = HashMap<Int, String>()          //  Mutable, READ and WRITE both, No Fixed Size
//    var myMap = mutableMapOf<Int, String>()     //  Mutable, READ and WRITE both, No Fixed Size     //  LinkedHashMap
//    var myMap = hashMapOf<Int, String>()        //  Mutable, READ and WRITE both, No Fixed Size

    myMap.put(5, "Junagadh")
    myMap.put(6, "Junagadh")
    myMap.put(44, "Bhilad")
    myMap.put(8, "Baroda")
    myMap.put(10, "Surat")

    myMap.replace(10, "Vapi")

    myMap.put(8, "Vadodara")

    for (key in myMap.keys) {
        println("Element at Key: $key = ${myMap[key]}")
//        OR
//        println("Element at Key: $key = ${myMap.get(key)}")
    }
}
