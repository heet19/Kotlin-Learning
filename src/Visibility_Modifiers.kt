/** Modifires */
/**
  Private
  Protected
  Internal
  Public
*/

/** world.a , world.b are not Visible
    world.c, world.d are Visible */

class TestClass {
    fun testing() {

        var world = World()
        print(world.c)
    }
}

/** Super Class */
open class World {

    private val a = 1
    protected val b = 2
    internal val c = 3
    public val d = 4    //  Public by Default

}

/** Subclass / Derived CLass */
class Country: World() {

/** a is not visible
    b, c, d are visible
*/

    fun test() {
        print(d)
    }

}