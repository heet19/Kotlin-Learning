fun main(args: Array<String>) {

/** PREDICATES */

    val myNumbers = listOf(2, 3, 4, 6, 23, 90)

    val myPredicate = { num:Int -> num > 10 }

    val check1 = myNumbers.all( myPredicate )       // Are all elements greater than 10?
    println(check1)

    val check2 = myNumbers.any( myPredicate )       //  Does any of these elements satisfy the Predicate?
    println(check2)

    val totalCount: Int = myNumbers.count( myPredicate )       // Number of elements that satisfy the Predicate
    println(totalCount)

    val num = myNumbers.find( myPredicate )         //  Returns the first number that matches the Predicate
    println(num)

}
