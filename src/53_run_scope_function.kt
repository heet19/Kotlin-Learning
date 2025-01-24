fun main() {

/** Scope Function: 'run'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'
*/

/** 'run' is combination of 'with' and 'let' */
/** If you want to operate on a Nullable object and avoid NullPointerException then use 'run' */

    val watch: Watch? = Watch()

    val bio = watch?.run {
        println(brand)
        println(model)
        model + 5
        "Watch is to good to buy"       // will be returned and stored in 'bio' variable
    }

    println(bio)

}

class Watch {
    var brand: String = "Tissot"
    var model: Int = 27578
}

