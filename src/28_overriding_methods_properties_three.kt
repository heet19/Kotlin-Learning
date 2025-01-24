fun main(args: Array<String>) {

/**
   1. Method Overriding
   2. Property Overriding
*/

    var dog = Dogsss()
    println(dog.color)

}

/** Super class / Parent class /  Base class */
open class Animalsss {
    open var color: String = "White"

    open fun eat() {
        println("Animal Eating")
    }

}

/** Subclass / Child class / Derived class */
class Dogsss: Animalsss() {

    var bread: String = ""

    override var color: String = "Black"

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super<Animalsss>.eat()
        println("Dog is eating")
    }

}

/** Subclass / Child class / Derived class */
class Catsss: Animalsss() {

    var age: Int = -1

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("Cat is eating")
    }

}
