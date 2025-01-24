fun main(args: Array<String>) {

/** Enum Class */

    /** Enum constants are objects of enum class type. */
    val heetCardTYpe: CreaditCardType = CreaditCardType.GOLD

    /** Each enum object has two properties: ordinal and name */
    println(CreaditCardType.GOLD.ordinal)
    println(CreaditCardType.GOLD.name)

    println(CreaditCardType.SILVER.name)     // OR  println(CreaditCardType.SILVER.name)

    /** Each enum object has two methods: values() and valueOf() */

    val myConstants: Array<CreaditCardType> = CreaditCardType.values()
    myConstants.forEach { println(it) }

    /** Using in 'When' Statement */
    when(heetCardTYpe) {
        CreaditCardType.SILVER -> println("Heet has silver card")
        CreaditCardType.GOLD -> println("Heet has gold card")
        CreaditCardType.PLATINUM -> println("Heet has platinum card")
    }

}

/** Enum Class */
enum class CreaditCardType {

    SILVER,     /** ordinal = 0      name="SILVER" */        // Enum Constants
    GOLD,       /** ordinal = 1      name="GOLD" */          // Enum Constants
    PLATINUM    /** ordinal = 2      name="PLATINUM" */      // Enum Constants

}

/** Enum classes are a convenient way to represent a concrete/real set of possible values.   */