fun main(args: Array<String>) {

/**   1. 'with' function
      2. 'apply' function
*/

    var myperson = MyPerson()

    with(myperson) {
        name = "Heet"
        age = 23
    }

    myperson.apply {
        name = "Heet Patel"
        age = 25
    }.startRun()

    println(myperson.name)
    println(myperson.age)

}

class MyPerson {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }
}