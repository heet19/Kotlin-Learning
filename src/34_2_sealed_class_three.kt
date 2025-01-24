fun main(args:Array<String>) {

/** Sealed */
/** Class outside the Sealed Class  */

    var circless = Circle(3.0f)
    var squaress = Square(8)
    var rectangless = Rectangles(20, 10)

    checkShapess(circless)
    checkShapess(squaress)
    checkShapess(rectangless)

}

sealed class Shapess {

}

/** You can define any type of subclass outside the sealed class too */
class Circle(var radius: Float): Shapess()
class Square(var side: Int): Shapess()
class Rectangles(var length: Int, var breadth: Int): Shapess()


fun checkShapess(shapess: Shapess) {

    when (shapess) {
        is Circle -> println("Circle area is ${3.14 * shapess.radius * shapess.radius}")
        is Square -> println("Square are is ${shapess.side * shapess.side}")
        is Rectangles -> println("Rectangle is ${shapess.length * shapess.breadth}")
//        else -> println("It is not a circle.")
    }
}
