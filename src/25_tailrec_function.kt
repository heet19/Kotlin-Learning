import java.math.BigInteger

fun main(args: Array<String>) {

/**
   Tailrec Function : Recursive Functions
       -> Prevents Stackoverflow Exception

   Fibonacci Series
       0  1  1  2  3  5  8  13  21 ......
*/

    println(getFibonacciNumber(650, BigInteger("1"), BigInteger("0")))

}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    if (n == 0)
        return b
    else
        return getFibonacciNumber(n-1, a+b, a)
}

