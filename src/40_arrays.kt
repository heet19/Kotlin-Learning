fun main(args: Array<String>) {

/** Arrays */

/** Elements:   0 0 0 0 0 0
    Index:      0 1 2 3 4 5
*/

    var myArray = Array<Int>(5) { 0 }       //  Mutable, Fixed Size
    myArray[0] = 32
    myArray[1] = 11
    myArray[3] = 54


    for (element in myArray) {      //  Using Individual Element (Objects)
        println(element)
    }

    println()

    for (index in 0..myArray.size - 1) {        //  Using Index of the Element (Objects)
        println(myArray[index])
    }

}