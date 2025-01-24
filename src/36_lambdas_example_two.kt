fun main(args: Array<String>) {

/**    EXAMPLE TWO
   1. Lambda Expression
   2. Higher-Order Function
*/

    val programs = Programs()

//    val myLambda: (Int, Int) -> Int = { x, y -> x + y }         //   Lambda Expression [ Function ]
//    programs.addTwoNumbers(4, 8, myLambda)

//    OR
//    programs.addTwoNumbers(4, 8, { x, y -> x + y })       //   Lambda Expression [ Function ]

//    OR
    programs.addTwoNumbers(5, 8) { x, y -> x + y }        //    Lambda Expression [ Function ]

}

class Programs {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) {      //  High Level Function with Lambda as Parameter

        val result = action(a, b)        // x + y = a + b = 2 + 7 = 9
        println(result)

    }
}
