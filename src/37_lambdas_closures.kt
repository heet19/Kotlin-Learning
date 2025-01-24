fun main(args: Array<String>) {

/** Closures */

    val myprogram = MyProgram()
    var result = 0

    myprogram.addTwoNumbers(3, 7) { x, y -> result = x + y }

    println(result)
}

class MyProgram {

    fun addTwoNumbers(a: Int, b:Int, action: (Int, Int) -> Unit) {          // High Level Function with Lambda as Parameter

        action(a, b)

    }

}


/**     A lambda expression or anonymous function (as well as a local function and an object expression)
 *      can access its closure, which includes the variables declared in the outer scope.
 *      The variables captured in the closure can be modified in the lambda     */