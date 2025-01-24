//Explore Ranges

fun main(args: Array<String>) {

    var r1 = (1..5)
    /** This range contains number 1, 2, 3, 4, 5 */
    println(r1.toList())

    val r2 = 5 downTo 1
    /** This range contains number 5, 4, 3, 2, 1 */
    println(r2.toList())

    val r3 = 5 downTo 1 step 2
    /** This range contains number 5, 3, 1 */
    println(r3.toList())

    val r4 = 'a'..'z'
    /** This range contains the values from "a", "b", "c" . . . "z" */
    println(r4.toList())

    var isPresent = 'c' in r4
    println(isPresent)

    var countDown = 10.downTo(1)
    /** This range contains number 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 */
    println(countDown.toList())

    var moveUp = 1.rangeTo(10)
    /** This range contains number 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 */
    println(moveUp.toList())

}
