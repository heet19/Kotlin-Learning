fun main(args: Array<String>) {

    /** Extension Functions: EXAMPLE ONE */

    var student = Student()
    println("Pass status: " + student.hasPassed(57))

    println("Scholarship Status: " + student.isScholar(57))

}

fun Student.isScholar(marks: Int): Boolean {

    return marks > 95
}

class Student {     //  Our Own Class

    fun  hasPassed(marks: Int): Boolean {

        return marks > 40
    }
}
