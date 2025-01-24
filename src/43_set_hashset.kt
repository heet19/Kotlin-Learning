fun main(args: Array<String>) {

/** Set */

/** "Set" contains unique elements
    "HashSet" also contains unique elements but sequence is not guaranteed in output
*/

    var mySet = setOf<Int>( 2, 1, 0, 9, 9, 9, 8 )        // Immutable. READ Only

    for (element in mySet) {
        println(element)
    }
}