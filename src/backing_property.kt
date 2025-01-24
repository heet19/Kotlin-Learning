fun main(args: Array<String>) {

/** Backing Property */

    val humans = Humans()
    humans.age = 45     //  set(45)

    println("Age is : ${humans.age}")       //  get()

}

//class Humans{
//
//    var age: Int = 0        //  Original property exposed outside. Anyone can modify it
//
//}

/** Alternate safe code using Backing Property */
class Humans {
    private var _age: Int = 0       //  Backing field: holds actual 'age' property data
    public var age: Int             //  Backing property: exposed to outside world
                get() {
                    return _age
                }
                set(value) {
                    _age = value
                }
}

/**  Within class Humans always use _age field to access the property
But outside class Humans, use age to access the property    */