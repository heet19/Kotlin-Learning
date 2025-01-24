fun main(args:Array<String>) {

/** Sealed */

    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(8)
    var rectangle = Shape.Rectangle(20, 10)

    checkShape(circle)
    checkShape(square)
    checkShape(rectangle)

}

sealed class Shape {

    class Circle(var radius: Float): Shape()
    class Square(var side: Int): Shape()             // subclass can be a regular class
    class Rectangle(var length: Int, var breadth: Int): Shape()

    // sealed class Line : Shape()     // subclass can be another sealed class
    // sealed interface Draw           // subclass can be an interface
    // data class Circle(var radius: Float): Shape()   // subclass can be a data class
}

fun checkShape(shape: Shape) {

    when (shape) {
        is Shape.Circle -> println("Circle area is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("Square are is ${shape.side * shape.side}")
        is Shape.Rectangle -> println("Rectangle is ${shape.length * shape.breadth}")
        //        else -> println("It is not a circle.")
    }
}


/**
    As the word sealed suggests, sealed classes conform to restricted or bounded class hierarchies.

    Note: All the subclasses of the sealed class must be defined within the same Kotlin file.
    However, it not necessary to define them within the sealed class,
    they can be defined in any scope where the sealed class is visible.
*/