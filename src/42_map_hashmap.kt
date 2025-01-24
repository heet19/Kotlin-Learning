fun main(args: Array<String>) {

/** Map */

/** Key-Value Pair */

    var myMap = mapOf<Int, String>( 4 to "Vadodara", 43 to "Rajkot", 7 to "Junagadh" )       //  Immutable, Fixed Size, READ ONLY

    for (key in myMap.keys) {      //  Using Individual Element (Objects)
        println("Element at Key: $key = ${myMap[key]}")
//        OR
//        println("Element at Key: $key = ${myMap.get(key)}")
    }
}
