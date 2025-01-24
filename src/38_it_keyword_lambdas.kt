fun main(args: Array<String>) {

/** 'it' keyword */

    val myPrograms = MyPrograms()
    myPrograms.reverseAndDisplay("Hello", { it.reversed() })

}

class MyPrograms {

    fun reverseAndDisplay(str: String, myFunc: (String) -> String) {        // High Level Function with Lambda as Parameter

        var result = myFunc(str)        // it.reversed() ====> str.reversed() ====> "hello".reversed() = "olleh"
        println(result)

    }
}


/**     It's very common for a lambda expression to have only one parameter.
 *
 *      If the compiler can parse the signature without any parameters, the parameter does not need to be declared and -> can be omitted.
 *      The parameter will be implicitly declared under the name it     */
