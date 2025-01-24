fun main(args: Array<String>) {

/** FILTER
    Returns a list containing only elements matching the given [predicate]
*/

/** MAP
    Returns a list containing the results of applying the given [transform] function
    to each element in the original collection
*/

    val myNumbers: List<Int> = listOf(2, 3, 4, 6, 23, 90)

    val mySmallNums: List<Int> = myNumbers.filter { it < 10 }      // { it < 10 } OR { num -> num < 10 }

    for (num in mySmallNums) {
        println(num)
    }

    println("----------------")

    val mySquaredNums = myNumbers.map { it * it }       //  { it * it } OR  { num -> num * num }

    for (num in mySquaredNums) {
        println(num)
    }

    println("----------------")

    val mySmallSquaredNums = myNumbers.filter { it < 10 }
        .map { it * it }

    for (num in mySmallSquaredNums) {
        println(num)
    }

    println("----------------")

    var people = listOf<Persons>(Persons(10, "Heet"), Persons(23, "Patel"), Persons(17, "Het"))
    var names = people.filter { it.name.startsWith("H") }
        .map { it.name }

    for (name in names) {
        println(name)
    }

}

class Persons(var age: Int, var name: String) {
    // Some other code...
}
