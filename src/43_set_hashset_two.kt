fun main(args: Array<String>) {

/** HashSet */

/** "Set" contains unique elements
    "HashSet" also contains unique elements but sequence is not guaranteed in output
*/

//    var mySets = mutableSetOf<Int>(1, 2, 20, 55, 58, 52)            // Mutable Set, READ and WRITE both
    var mySets = hashSetOf<Int>( 2, 55, 98, 42, 0, 9, 9, 9, 8 )     // Mutable Set, READ and WRITE both

    mySets.remove(2)
    mySets.add(19)

    for (element in mySets) {
        println(element)
    }
}