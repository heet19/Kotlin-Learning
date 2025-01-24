fun main(args: Array<String>) {

/** Scope Function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'
*/

    val devices = Devices().apply {
        this.name = "Lava"
        this.model = 21

/** OR we can write without this keyword */
//        name = "Lava"
//        model = 21

    }

    with(devices) {
        println(name)       //  prints  Lava
        println(model)      //  prints  21
    }

}

class Devices() {
    var name: String = ""
    var model: Int = 0
}