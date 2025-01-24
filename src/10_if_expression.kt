fun main(args: Array<String>) {

    /** IF as Expression    */

    val a = 2
    val b = 5

    var maxValue: Int = if (a > b) {
                            println("a is greater")
                            a
                        } else {
                            println("b is greater")
                            b
                        }

    println(maxValue)
}
