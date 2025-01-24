fun main(args: Array<String>) {

    /** CONTINUE Keyword and Labelled FOR Loop */

    for (i in 1.rangeTo(10)) {
        if (i == 5) {
            continue
        }
        println(i)
    }


    println()       // this print is for space between the loop outputs.


    for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue
            }
            println("$i $j")
        }
    }


    println()       // this print is for space between the loop outputs.


    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue@myLoop
            }
            println("$i $j")
        }
    }


}