fun main(args: Array<String>) {

/** Data Class */

    var user1 = User("Heet", 10)
    var user2 = User("Heet", 10)

    println(user1)

    if (user1 == user2) {
        println("Equal")
    } else {
        println("Not Equal")
    }

    var newUser = user1.copy(id = 25)
    println(newUser)
}

data class User(var name:String, var id:Int) {

}