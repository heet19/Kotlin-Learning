fun main(args: Array<String>) {

/** Class, Primary Constructor, Init Block */

    var customer = Customer("Heet")

}

/** Class, Primary Constructor */
class Customer (var name: String) {

/** Init Block */
    init {
        println("customer has got a name as $name")
    }

}