fun main(arga: Array<String>) {

    /** FOR Loop */

    for (i in 1..10) {
        println(i)
    }

    println()       // this print is for space between the loop outputs.

    for (j in 11.rangeTo(20)) {
        println(j)
    }

    println()       // this print is for space between the loop outputs.

    for (k in 1.rangeTo(30)) {

        if (k % 3 == 0) {
            println(k)
        }
    }

    println()       // this print is for space between the loop outputs.

    for (a in 1..10 step 2) {
        println(a)
    }

    println()       // this print is for space between the loop outputs.

    for (b in 5 downTo 1) {
        println(b)
    }

    println()       // this print is for space between the loop outputs.

    for (c in 5 downTo 1 step 2) {
        println(c)
    }

}