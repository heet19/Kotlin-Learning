fun main(arg: Array<String>) {

/** INFIX FUNCTIONS */

    val p:Int = 6
    val q:Int = 10

    val greaterVal = p greaterValues q      // p.greaterValue(q)
    println(greaterVal)

}

infix fun Int.greaterValues(other:Int): Int {       // Infix Function and also Extension Function
    if (this > other)
        return this
    else
        return other
}


/**
    1. All INFIX Functions are Extension functions
    But all Extension functions are not INFIX
    2. INFIX Functions just have ONE PARAMETER
*/
