fun main (args: Array<String>) {

    /** DO WHILE Loop */

    var i:Int = 1

    do {
        println(i)
        i++
    } while (i <= 5)

    println()       // this print is for space between the loop outputs.

    var j:Int = 1
    do {
        if (j % 2 == 0) {
            println(j)
        }
        j++
    } while (j <= 10)

    println()       // this print is for space between the loop outputs.

    var k = 5
    do {
        if (k % 2 == 0) {
            println(k)
        }
        k--
    } while (k >= 0)

}
