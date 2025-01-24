fun main(args: Array<String>) {

    /** Extension Functions: EXAMPLE THREE */

    val x:Int = 6
    val y:Int = 10

    x.toFloat()

    val greaterVal = x.greaterValue(y)
    println(greaterVal)

}

fun Int.greaterValue(other: Int): Int {

    if (this > other)
        return this
    else
        return other
}
