fun main(args: Array<String>) {

/** Scope Function: 'with'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'
*/


    val  device = Device()

    val modelAfterFiveYears: Int = with(device) {

/** OR we can write without this keyword */
//        println(name)
//        println(model)

        println(this.name)
        println(this.model)
        model + 5
    }

    println("Model after five years is $modelAfterFiveYears")

}

class Device {

    var name: String = "Mobile"
    var model: Int = 15

}