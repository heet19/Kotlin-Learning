fun main(args: Array<String>) {

    /** Explore String Interpolation in Kotlin */

    val name = "Heet"
    val str = "Hello $name"

    println(str)


    val Name2 = "Heet Patel"
    val str2 = "Hello $Name2"

    println("The Statement is ${str2.uppercase()}. The number of characters in statement is ${str2.length}")


    var a = 10
    var b = 5

    println("The sum of $a and $b is ${a + b}")

    val rect = Rectangle()
    rect.length = 5
    rect.breadth = 3

    println("The length of the rectangle is ${rect.length} and breadth is ${rect.breadth}. The area is ${rect.length * rect.breadth}")

}

class Rectangle {
    var length: Int = 0
    var breadth: Int = 0
}
