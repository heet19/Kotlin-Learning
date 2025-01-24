fun main(args: Array<String>) {

/** lateinit keyword */

/** lateinit used only with mutable data type [ var ]
    lateinit used only with non-nullable data typealias
    lateinit values must be initialised before you use it
    If you try to access lateinit variable without initializing it then it throws UninitializedPropertyAccessException
*/

    val country = Countries()
    country.name = "Bharat"
    println(country.name)

    country.setup()

}

class  Countries {

    lateinit var name: String

    fun setup() {
        name = "India"
        println("The name of country is $name")
    }

}


/** lateinit is used for the late initialization of a variable in Kotlin.
    Using the lateinit keyword, you can declare a variable and not provide an initial value for the variable.
    It specifies that the variable will be initialized later in the program.  */