fun main(args: Array<String>) {

/** Inheritance with Primary and Secondary Constructors */

    var suv = SUV("Black","Land Rover")

}

/** Super class / Parent class /  Base class */
open class Cars {

    var color: String = ""

    constructor(color: String) {
        this.color = color

        println("From Cars: $color")
    }

}

/** Subclass / Child class / Derived class */
class SUV: Cars {

    var company: String = ""

    constructor(color: String, company: String): super(color) {
        this.company = company

        println("From SUV: $color and $company")

    }

}
