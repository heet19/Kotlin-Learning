fun main(args: Array<String>) {

    /** BREAK Keyword and Labelled FOR Loop */

    for (i in 1..10) {
        println(i)

        if (i == 5) {
            break
        }
    }


    println()       // this print is for space between the loop outputs.


    /** Labelled FOR Loop */

    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2) {
                break@myLoop
            }
        }
    }

//    println()

//    for (i in 1..3) {
//        for (j in 1..3) {
//            println("$i $j")
//            if (i == 2 && j == 2) {
//                break
//            }
//        }
//        if (i == 2)
//        break
//    }

}