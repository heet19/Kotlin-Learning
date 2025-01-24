import java.util.*

fun main(args: Array<String>) {

/** User Input  */

    print("Enter text: ")
    var input1 = readLine()

    println("Your input is $input1")

    /** create an object for scanner class  */
    val number1 = Scanner(System.`in`)
    print("Enter an integer: ")

    /** nextInt() method is used to take */
    /** next integer value and store in enteredNumber1 variable */
    var enteredNumber1:Int = number1.nextInt()
    println("You entered: $enteredNumber1")

    val number2 = Scanner(System.`in`)
    print("Enter a float value: ")

    /** nextFloat() method is used to take next */
    /** Float value and store in enteredNumber2 variable */
    var enteredNumber2:Float = number2.nextFloat()
    println("You entered: $enteredNumber2")

    val booleanValue = Scanner(System.`in`)
    print("Enter a boolean: ")
    /** nextBoolean() method is used to take */
    /** next boolean value and store in enteredBoolean variable */
    var enteredBoolean:Boolean = booleanValue.nextBoolean()
    println("You entered: $enteredBoolean")
}
