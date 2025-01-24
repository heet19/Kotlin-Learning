fun main(args: Array<String>) {

/**
   1. Method Overriding
   2. Property Overriding
*/

    var dog = Dogs()
    dog.eat()

    var cat = Cats()
    cat.eat()

    var animal = Animals()
    animal.eat()

}

/** Super class / Parent class /  Base class */
open class Animals {
    var color: String = ""

    open fun eat() {
        println("Animal Eating")
    }

}

/** Subclass / Child class / Derived class */
class Dogs: Animals() {

    var bread: String = ""

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        println("Dog is eating")
    }

}

/** Subclass / Child class / Derived class */
class Cats: Animals() {

    var age: Int = -1

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("Cat is eating")
    }

}
