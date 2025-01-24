fun main(args: Array<String>) {

/** Inheritance */

    var dog = Dog()
    dog.bread = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()

}

/** Super class / Parent class /  Base class */
open class Animal {
    var color: String = ""

    fun eat() {
        println("Eat")
    }

}

/** Subclass / Child class / Derived class */
class Dog: Animal() {

    var bread: String = ""

    fun bark() {
        println("Bark")
    }

}

/** Subclass / Child class / Derived class */
class Cat: Animal() {

    var age: Int = -1

    fun meow() {
        println("Meow")
    }

}
