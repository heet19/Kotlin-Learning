fun main(args: Array<String>) {

/**
   1. Method Overriding
   2. Property Overriding
*/

    var dog = Dogss()
    dog.eat()

}

/** Super class / Parent class /  Base class */
open class Animalss {
    var color: String = ""

    open fun eat() {
        println("Animal Eating")
    }

}

/** Subclass / Child class / Derived class */
class Dogss: Animalss() {

    var bread: String = ""

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super<Animalss>.eat()
        println("Dog is eating")
    }

}

/** Subclass / Child class / Derived class */
class Catss: Animalss() {

    var age: Int = -1

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("Cat is eating")
    }

}
