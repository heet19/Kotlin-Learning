fun main(args: Array<String>) {

/** INTERFACE */

    var myBtn = MyButtons()
    myBtn.onTouch()
    myBtn.onClick()

}

interface MyInterface {          // you cannot create instance of Interface

    fun onTouch()                // Methods in interface are abstract by default

    fun onClick() {              // Normal Method are public and open by default NOT FINAL
        // Your code
        println("MyInterface: onClick")
    }
}

interface MySecondInterface {          // you cannot create instance of Interface

    fun onTouch() {
        println("MySecondInterface: onTouch")
    }

    fun onClick() {                      // Normal Method are public and open by default NOT FINAL
        // Your code
        println("MySecondInterface: onClick")
    }
}

class MyButtons : MyInterface, MySecondInterface {

    override fun onClick() {
        super<MyInterface>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onTouch() {
        super.onTouch()
    }

}
