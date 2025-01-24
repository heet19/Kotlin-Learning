fun main(args: Array<String>) {

/** List and ArrayList */

//    var list = arrayListOf<String>()      // Mutable, No Fixed Size, Can Add or Remove Elements
//    var list = ArrayList<String>()              // Mutable, No Fixed Size, Can Add or Remove Elements
    var list = mutableListOf<String>()          //  Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Hi")
    list.add("Hello")
    list.add("Fine")

    list.remove("Hello")
    list.add(1, "Goodluck")

    list[2] = "Morning"

    for (element in list) {      //  Using Individual Element (Objects)
        println(element)
    }

    println()

    for (index in 0..list.size - 1) {       //  Using Index of the Element (Objects)
        println(list[index])        //  list.get(index)
    }

}