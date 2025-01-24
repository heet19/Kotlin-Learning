fun main(args: Array<String>) {

/** Backing Property Example */

    val studentss = Studentss()
    studentss.addHobby("Cricket")

/** Accidental deletion of data: We don't want this */
/** studentss.hobbies.remove("Cricket")     //  gives Error while using Alternate safe code using Backing Property */

    println(studentss.hobbies)
}

//class Studentss{
//
//    public val hobbies = mutableListOf<String>()       //  mutable
//
//    fun addHobby(hobbyName: String) {
//        hobbies.add(hobbyName)
//    }
//}

/** Alternate safe code using Backing Property */
class Studentss {

    private val _hobbies = mutableListOf<String>()      //  backing field
    public val hobbies: List<String>        //  backing property: immutable
        get() = _hobbies

    fun addHobby(hobbyName: String) {
        _hobbies.add(hobbyName)
    }
}
