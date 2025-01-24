fun main(args: Array<String>) {

    /** FUNCTIONS Basics */

    add()

    sub(4, 2)

    var multiply = multi(4, 4)
    println("Multiply is $multiply")

}

fun add(): Unit {
    var a = 2
    var b = 4
    println("Sum is ${a + b}")
}

fun sub(x: Int, y: Int) {
    println("Sub is ${x - y}")
}

fun multi(p: Int, q: Int): Int {

    return p*q
}
