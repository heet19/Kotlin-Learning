fun main(args: Array<String>) {

/** Extension Functions: EXAMPLE THREE */

    val str1:String = "Hello "
    val  str2:String = "World"

    var str3:String = "Hey "

    println(str3.add(str1, str2))

}

fun String.add(s1: String, s2: String): String {

    return this + s1 + s2
}