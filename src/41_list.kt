fun main(args: Array<String>) {

/** List and ArrayList */

    var list = listOf<String>( "Hi", "Hello", "Fine" )      //  Immutable, Fixed Size, READ ONLY


    for (element in list) {      //  Using Individual Element (Objects)
        println(element)
    }

    println()

    for (index in 0..list.size - 1) {       //  Using Index of the Element (Objects)
        println(list[index])        //  list.get(index)
    }

}