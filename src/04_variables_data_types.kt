/** This is main function. Entry point of the application.    */

fun main(args: Array<String>) {

    var myNumber = 10       // Int
    var myDecimal = 1.9     // Float
    var isActive = true     // Boolean

    var myString: String    // Mutable String
    myString = "Hello World"
    myString = "Hi World"

    val myAnotherString = "My constant string value"    // Immutable String
//    myAnotherString = "some value"  // NOT ALLOWED, since it is immutable

    var age: Int
    age = 25

    var myName: String = "Heet Patel"

    var myAge: Int = 85

    println(myNumber)
    println(myDecimal)
    println(isActive)
    println(myString)
    println(myAnotherString)
    println("My age is ${age}")
    println("MY name is " + myName)
    println(myAge)

}
