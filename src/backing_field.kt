fun main(args: Array<String>) {

/** Backing Field */
/** 'field' keyword within custom Getter and Setter methods */

    val human = Human()
    human.age = 54      //  Calls set(54)
    human.age           // Calls get()

}

class Human {

    var age = 20        //  Backing field generated
        get() {
//            println("Age is : $age")      // throws StackOverflow exception
            println("Age is : $field")      // 'field' keyword stores the value of 'age' property
            return field                    //  Returns the value of 'age' property
        }
        set(value) {
            if (value >= 0) {
                field = value       //  assigns the value to age property
                // age = value      //  ERROR: StackOverflow exception
            }
        }

    var name: String = ""       //  No backing field generated

    val isOld: Boolean          //  No backing field generated
        get() = 50 >= age

}


/**  Backing field is only generated for those getter or setter where the usage of 'field' keyword is required. */