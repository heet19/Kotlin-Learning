fun main(args: Array<String>) {

    /** Named Parameters */

    findVolume(height = 40, length = 6, breadth = 5)

}

fun findVolume(length: Int, breadth: Int, height: Int = 10) {
    println("Length is " + length)
    println("Breadth is " + breadth)
    println("height is " + height)
}