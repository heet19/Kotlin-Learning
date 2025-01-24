import java.util.*

fun main(args: Array<String>) {

    /** WHEN as Expression */

    val x = 100

    val str: String  = when (x) {
                            1 -> "x is 1"
                            2 -> "x is 2"
                            else -> {
                                "x value is unknown"
                                "x is an alien"
                            }
    }

    println(str)


    println(".............................")        // this print is for space between two example


    print("Enter no.: ")
    val numberint = Scanner(System.`in`)
    var number1: Int = numberint.nextInt()

    var y = number1

    var days: String = when (y) {
                            1 -> "Monday"
                            2 -> "Tuesday"
                            3 -> "Wednesday"
                            4 -> "Thrusday"
                            5 -> "Friday"
                            6 -> "Saturday"
                       else -> {
                            "Sunday"
                       }
    }

    println(days)

}
