fun main(args: Array<String>) {

/** INTERFACE */

    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()

}

interface MyInterfaceListener {          // You cannot create instance of Interface

    var name: String                     // Properties in interface are abstract by default

    fun onTouch()

    fun onClick() {                      // Normal Method are public and open by default NOT FINAL
        // Your code
        println("onClick Interface code: Button Clicked")
    }
}

class MyButton : MyInterfaceListener {
    //Body

    override var name:String = "Dummy Name"

    override fun onTouch() {
        //Define your own code
        println("The button was Touched")
    }

    override fun onClick() {
        super.onClick()
        println("The button was Clicked")
    }
}
