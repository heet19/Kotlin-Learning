fun main(args: Array<String>) {

/**    EXAMPLE ONE
   1. Lambda Expression
   2. Higher-Order Function
*/

    val program = Program()

    program.multiTwoNumbers(2, 7)

    program.subTwoNumbers(2, 7, object : MyInterfaces{      // Using Interface / OOPs way
        override fun execute(sub: Int) {
            println(sub)    //  Body
        }

    })

    val myLambda: (Int) -> Unit = { s: Int -> println(s) }         // Lambda Expression [ Function ]

    program.addTwoNumbers(2, 7, myLambda)

}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) {         // High Level Function with Lambda as Parameter

        val sum = a + b
        action(sum)     // println(sum)
    }

    fun subTwoNumbers(a: Int, b: Int, action: MyInterfaces) {         // Using Interface / Object-Oriented Way

        val sub = a - b
        action.execute(sub)
    }

    fun multiTwoNumbers(a: Int, b: Int) {

        val multi = a * b
        println(multi)    //  Body
    }
}

interface MyInterfaces {
    fun  execute(sub: Int)
}