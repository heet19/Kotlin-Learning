fun main(args: Array<String>) {

    /** FUNCTIONS as Expressions */

    var smallValue = min(80, 12)

    println("The smaller number is $smallValue")


    var largeValue = max(7, 11)

    println("The greater number is $largeValue")

}

fun min(x: Int, y: Int): Int = if (x < y) x else y

fun max(a: Int, b:Int): Int = if (a > b) {
                                println("$a is greater")
                                a
                              } else {
                                println("$b is greater")
                                b
                              }

