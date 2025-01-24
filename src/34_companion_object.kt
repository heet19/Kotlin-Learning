fun main(args: Array<String>) {

/** Companion Object */

    MyClass.count       // You can print it and check result
    println(MyClass.count)

    MyClass.typeOfCustomer()
    println(MyClass.typeOfCustomer())

}

class  MyClass {

    companion object {

        var count: Int = -1      // Behaves like STATIC variable

        fun typeOfCustomer(): String {      // Behaves like STATIC variable
            return "Indian"
        }
    }


}