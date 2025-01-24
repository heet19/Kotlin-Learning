fun main (args: Array<String>) {

    /** WHILE Loop */

    var i: Int = 1
    while (i <= 10) {
        println(i)
        i++
    }

    println()       // this print is for space between the loop outputs.

    var j: Int = 1
    while (j <= 10) {
        if (j % 2 == 0) {
            println(j)
        }
        j++
    }

}