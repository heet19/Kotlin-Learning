fun main(arg: Array<String>) {

/** Object Declaration */

    CustomersData.count = 98
    CustomersData.typeOfCustomers()

    println(CustomersData.count)

    CustomersData.count = 104
    println(CustomersData.count)

    CustomersData.myMethod("Hello")

}

open class MySuperClass {

    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomersData : MySuperClass() {         // Object Declaration

    var count:Int = -1      // Behaves like STATIC variable

    fun typeOfCustomers(): String {     // Behaves like STATIC methods
        return "Indian"
    }

    override fun myMethod(str: String) {        // Currently, behaving like STSTIC method
        super.myMethod(str)
        println("object CustomerData: "+ str)
    }

    init {
        // Your code.
    }
}

