fun main(args: Array<String>) {

/** Interoperability Example */

    var area = MyJavaFile.getArea(10, 5);
    println("Printing area from Kotlin file : " + area)

}

fun add(a: Int, b:Int): Int {
    return a + b
}


/**
 *
 * public class myKotlinInteroperability
 *  public class myKotlinInteroperability {
 *
 *  public static int add(int a, int b) {
 *      return a + b;
 *  }
 *
 *  }
 * }
*/