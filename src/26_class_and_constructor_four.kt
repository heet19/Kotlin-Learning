fun main(args: Array<String>) {

/** Class, Primary Constructor, Secondary Constructor and Init Block */

    var people = People("Heet", 10)

    print(people.id)

}

/** Class, Primary Constructor */
class People(var name: String) {

    var id: Int = -1

    /** Init Block */
    init {
        println("People has got a name as $name and id is $id")
    }

    /** Secondary Constructor */
    constructor(n: String, id: Int): this(n) {
        /** The body of the secondary constructor is called after init block */
        this.id = id
    }
}
