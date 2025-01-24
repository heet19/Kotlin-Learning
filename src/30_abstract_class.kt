fun main(args: Array<String>) {

/** Abstract Class */

//    var person = MyPerson()   // Not allowed. You cannot create instance of abstract class

    var person = Indian()       // Allowed. Abstract Super class reference variable
                                // pointing to child class object.
    person.name = "Steve"
    person.eat()
    person.goTOSchool()

}

abstract class Peoples {          // you cannot create instance of abstract class

    abstract var name: String

    abstract fun eat()          // abstract properties are 'open' by default

    open fun getHeight() {}     // A 'open' function ready to be overridden

    fun goTOSchool() {}         // A normal function: public and final by default

}

class Indian: Peoples() {         // Sub Class or Derived Class

    override var name: String = "dummy_indian_name"

    override fun eat() {
        // Our own code
        println(name)
    }
}
