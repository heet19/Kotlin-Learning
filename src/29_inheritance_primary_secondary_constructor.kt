import java.awt.Color

fun main(args: Array<String>) {

/** Inheritance with Primary Constructors */

    var sedan = Sedan("Black","Range Rover")

}

/** Super class / Parent class /  Base class */
open class Car(var color: String) {

    init {
        println("From Car Init: $color")
    }

}

/** Subclass / Child class / Derived class */
class Sedan(color: String, company: String): Car(color) {

    init {
        println("From Sedan Init: $color and $company")
    }

}