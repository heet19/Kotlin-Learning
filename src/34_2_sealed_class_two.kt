fun main(args:Array<String>) {

/** Sealed */
/** Using Object */

    var circles = Shapes.Circle(3.0f)
    var squares = Shapes.Square(8)
    var rectangles = Shapes.Rectangle(20, 10)

    checkShapes(circles)
    checkShapes(squares)
    checkShapes(rectangles)

    val noShapes = Shapes.NotAShape
    checkShapes(noShapes)

}

sealed class Shapes {

    class Circle(var radius: Float): Shapes()
    class Square(var side: Int): Shapes()
    class Rectangle(var length: Int, var breadth: Int): Shapes()

    object NotAShape: Shapes()      // subclass can be an object (singleton)

}

fun checkShapes(shapes: Shapes) {

    when (shapes) {
        is Shapes.Circle -> println("Circle area is ${3.14 * shapes.radius * shapes.radius}")
        is Shapes.Square -> println("Square are is ${shapes.side * shapes.side}")
        is Shapes.Rectangle -> println("Rectangle is ${shapes.length * shapes.breadth}")
        Shapes.NotAShape -> println("No Shape Found")       // 'is' is not required for object (singleton)
//        else -> println("It is not a circle.")
    }
}
